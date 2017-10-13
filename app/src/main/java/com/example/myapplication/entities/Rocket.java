
package com.example.myapplication.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rocket {

    @SerializedName("rocket_id")
    @Expose
    private String rocketId;
    @SerializedName("rocket_name")
    @Expose
    private String rocketName;
    @SerializedName("rocket_type")
    @Expose
    private String rocketType;

    public String getRocketId() {
        return rocketId;
    }

    public void setRocketId(String rocketId) {
        this.rocketId = rocketId;
    }

    public String getRocketName() {
        return rocketName;
    }

    public void setRocketName(String rocketName) {
        this.rocketName = rocketName;
    }

    public String getRocketType() {
        return rocketType;
    }

    public void setRocketType(String rocketType) {
        this.rocketType = rocketType;
    }

}
