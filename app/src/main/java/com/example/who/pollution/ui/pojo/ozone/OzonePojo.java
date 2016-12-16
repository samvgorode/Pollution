package com.example.who.pollution.ui.pojo.ozone;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

/**
 * Created by who on 16.12.2016.
 */

public class OzonePojo implements Serializable {
    @Expose
    private String time;
    @Expose
    private com.example.who.pollution.ui.pojo.ozone.Location location;
    @Expose
    private Double data;

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

    public Double getData() {
        return data;
    }

    public void setData(Double data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\n time= " + time +
                "\n " + location +
                "\n data= " + data +"\n";
    }
}
