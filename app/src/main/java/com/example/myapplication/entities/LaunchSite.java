
package com.example.myapplication.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LaunchSite {

    @SerializedName("site_id")
    @Expose
    private String siteId;
    @SerializedName("site_name")
    @Expose
    private String siteName;

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

}
