package com.example.who.pollution.ui.pojo.carbonMonoxide;

import android.location.Location;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.List;

/**
 * Created by who on 16.12.2016.
 */

public class CarbonMonoxidePojo implements Serializable {


    @Expose
    private String time;

    @Expose
    private Location location;

    @Expose
    private List<Datum> data;

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

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\n time= " + time + "\n" +
                "\n " + location +
                "\n data= " + data;
    }
}

