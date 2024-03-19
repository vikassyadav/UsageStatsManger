package com.example.usagestatsmanger;

import android.graphics.drawable.Drawable;

public class newApp {
//    public Drawable appIcon;
    public  String appName;
    public  String usageDuration;
    public  int usagePercentage;


    public newApp() {
    }
    public newApp(String appName, String usageDuration, int usagePercentage) {
//        this.appIcon = appIcon;
        this.appName = appName;
        this.usageDuration = usageDuration;
        this.usagePercentage = usagePercentage;
    }

//    public Drawable getAppIcon() {
//        return appIcon;
//    }
//
//    public void setAppIcon(Drawable appIcon) {
//        this.appIcon = appIcon;
//    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getUsagePercentage() {
        return usagePercentage;
    }

    public void setUsagePercentage(int usagePercentage) {
        this.usagePercentage = usagePercentage;
    }

    public String getUsageDuration() {
        return usageDuration;
    }

    public void setUsageDuration(String usageDuration) {
        this.usageDuration = usageDuration;
    }
}
