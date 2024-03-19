package com.example.usagestatsmanger;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class liveScreenUsageStats extends AppCompatActivity {

    RecyclerView recyclerView;
    newAdapter newadapter;
    FirebaseFirestore db;
    ArrayList<newApp> fdData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_screen_usage_stats);
        recyclerView=findViewById(R.id.rvLiveUsageStats);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        fdData=new ArrayList<>();
        newadapter = new newAdapter(fdData);
        recyclerView.setAdapter(newadapter);
        Collections.reverse(fdData);

        db=FirebaseFirestore.getInstance();

        db.collection("appUsage")
                .orderBy("usagePercentage", Query.Direction.DESCENDING) // Order by usagePercentage in descending order
                .get()
                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @SuppressLint("NotifyDataSetChanged")
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
//                       data from firestore reached here
                        List<DocumentSnapshot> list = (ArrayList<DocumentSnapshot>) queryDocumentSnapshots.getDocuments();
                        for ( DocumentSnapshot d : list) {
                            newApp obj = d.toObject(newApp.class);
                            fdData.add(obj);
                        }
//                        // Notify the adapter that the data set has changed
                        newadapter.notifyDataSetChanged();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        // Handle errors
                        Log.e("FirestoreError", "Error fetching documents: ", e);
                    }
                });
    }
}