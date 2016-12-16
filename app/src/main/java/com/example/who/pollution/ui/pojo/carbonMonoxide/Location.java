package com.example.who.pollution.ui.pojo.carbonMonoxide;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

/**
 * Created by who on 16.12.2016.
 */

public class Location implements Serializable {

    @Expose
    private Float latitude;

    @Expose
    private Float longitude;

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "\n latitude= " + latitude +
                "\n longitude= " + longitude + "\n";
    }
}
