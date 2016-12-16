package com.example.who.pollution.ui.pojo.nitrogenDioxide;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

/**
 * Created by who on 16.12.2016.
 */

public class NitrogenDioxidePojo implements Serializable {
    @Expose
    private String time;
    @Expose
    private com.example.who.pollution.ui.pojo.nitrogenDioxide.Location location;
    @Expose
    private com.example.who.pollution.ui.pojo.nitrogenDioxide.Data data;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public com.example.who.pollution.ui.pojo.nitrogenDioxide.Data getData() {
        return data;
    }

    public void setData(com.example.who.pollution.ui.pojo.nitrogenDioxide.Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\ntime= " + time + "\n" +
                "\n" + location +
                "\n" + data;
    }
}
