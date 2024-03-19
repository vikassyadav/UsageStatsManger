package com.example.usagestatsmanger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class newAdapter extends RecyclerView.Adapter<newAdapter.myViewHolder> {
    Context context;
    private ArrayList<newApp> fdData;

    public newAdapter(ArrayList<newApp> fdData) {
        this.context = context;
        this.fdData = fdData;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.newsinglerow,parent,false);//f
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        newApp usageStats = fdData.get(position);

        holder.appName.setText(usageStats.getAppName());
        holder.UasgeDuration.setText(usageStats.getUsageDuration());
        holder.usagePercent.setText(usageStats.getUsagePercentage() + "%");
//        holder.icon_img.setImageDrawable(usageStats.appIcon);
//        holder.progressBar.setProgress(usageStats.usagePercentage);
    }

    @Override
    public int getItemCount() {
        return fdData.size();
    }

    public class  myViewHolder extends RecyclerView.ViewHolder{
        TextView appName, UasgeDuration, usagePercent;
//        ProgressBar progressBar;
//        ImageView icon_img;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            appName =itemView.findViewById(R.id.app_name_tv);
            UasgeDuration=itemView.findViewById(R.id.usage_duration_tv);
            usagePercent=itemView.findViewById(R.id.usage_perc_tv);
//            icon_img = itemView.findViewById(R.id.icon_img);
//            progressBar = itemView.findViewById(R.id.progressBar);


        }
    }
}
