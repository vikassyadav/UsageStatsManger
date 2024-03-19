package com.example.usagestatsmanger;

import android.graphics.drawable.Drawable;

public class liveApp {
    public Drawable appIcon;

    String base64Image ;
    public  String appName;
    public  int usagePercentage;
    public  String usageDuration;

    public liveApp() {
    }
    public liveApp(Drawable appIcon,String base64Image, String appName, int usagePercentage, String usageDuration) {
        this.appIcon = appIcon;
        this.base64Image = base64Image;
        this.appName = appName;
        this.usagePercentage = usagePercentage;
        this.usageDuration = usageDuration;
    }

    public Drawable getAppIcon() {
        return appIcon;
    }

    public void setAppIcon(Drawable appIcon) {
        this.appIcon = appIcon;
    }
    public String getBase64Image() {
        return base64Image;
    }
    public void setBase64Image(String base64Image) {
        this.base64Image = base64Image;
    }

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
