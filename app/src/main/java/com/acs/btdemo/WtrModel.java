package com.acs.btdemo;

import com.google.gson.annotations.SerializedName;

public class WtrModel {
    @SerializedName("id_wtr")
    private String id_wtr;
    @SerializedName("no_WTR")
    private String title;
    @SerializedName("waktu")
    private String tanggal_wtr;
    @SerializedName("epoch")
    private String epoch;

    public String getEpoch() {
        return epoch;
    }

    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    public WtrModel(String title, String tanggal_wtr, String epoch, String id_wtr) {
        this.title = title;
        this.tanggal_wtr=tanggal_wtr;
        this.epoch=epoch;
        this.id_wtr=id_wtr;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTanggal_wtr() {
        return tanggal_wtr;
    }

    public void setTanggal_wtr(String tanggal_wtr) {
        this.tanggal_wtr = tanggal_wtr;
    }

    public String getId_wtr() {
        return id_wtr;
    }

    public void setId_wtr(String id_wtr) {
        this.id_wtr = id_wtr;
    }
}
