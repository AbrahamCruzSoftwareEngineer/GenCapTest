
package com.example.myapplication.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Payload {

    @SerializedName("payload_id")
    @Expose
    private String payloadId;
    @SerializedName("customers")
    @Expose
    private List<String> customers = null;
    @SerializedName("payload_type")
    @Expose
    private String payloadType;
    @SerializedName("payload_mass_kg")
    @Expose
    private Integer payloadMassKg;
    @SerializedName("payload_mass_lbs")
    @Expose
    private String payloadMassLbs;
    @SerializedName("orbit")
    @Expose
    private String orbit;
    @SerializedName("mass_returned_kg")
    @Expose
    private Integer massReturnedKg;
    @SerializedName("mass_returned_lbs")
    @Expose
    private Integer massReturnedLbs;
    @SerializedName("flight_time_sec")
    @Expose
    private Integer flightTimeSec;
    @SerializedName("cargo_manifest")
    @Expose
    private String cargoManifest;

    public String getPayloadId() {
        return payloadId;
    }

    public void setPayloadId(String payloadId) {
        this.payloadId = payloadId;
    }

    public List<String> getCustomers() {
        return customers;
    }

    public void setCustomers(List<String> customers) {
        this.customers = customers;
    }

    public String getPayloadType() {
        return payloadType;
    }

    public void setPayloadType(String payloadType) {
        this.payloadType = payloadType;
    }

    public Integer getPayloadMassKg() {
        return payloadMassKg;
    }

    public void setPayloadMassKg(Integer payloadMassKg) {
        this.payloadMassKg = payloadMassKg;
    }

    public String getPayloadMassLbs() {
        return payloadMassLbs;
    }

    public void setPayloadMassLbs(String payloadMassLbs) {
        this.payloadMassLbs = payloadMassLbs;
    }

    public String getOrbit() {
        return orbit;
    }

    public void setOrbit(String orbit) {
        this.orbit = orbit;
    }

    public Integer getMassReturnedKg() {
        return massReturnedKg;
    }

    public void setMassReturnedKg(Integer massReturnedKg) {
        this.massReturnedKg = massReturnedKg;
    }

    public Integer getMassReturnedLbs() {
        return massReturnedLbs;
    }

    public void setMassReturnedLbs(Integer massReturnedLbs) {
        this.massReturnedLbs = massReturnedLbs;
    }

    public Integer getFlightTimeSec() {
        return flightTimeSec;
    }

    public void setFlightTimeSec(Integer flightTimeSec) {
        this.flightTimeSec = flightTimeSec;
    }

    public String getCargoManifest() {
        return cargoManifest;
    }

    public void setCargoManifest(String cargoManifest) {
        this.cargoManifest = cargoManifest;
    }

}
