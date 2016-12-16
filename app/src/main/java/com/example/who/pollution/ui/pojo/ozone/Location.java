package com.example.who.pollution.ui.pojo.ozone;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

/**
 * Created by who on 16.12.2016.
 */

public class Location implements Serializable {
    @Expose
    private Double latitude;
    @Expose
    private Double longitude;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    @Override
    public String toString() {
        return "\n latitude= " + latitude +
                "\n longitude= " + longitude + "\n";
    }
}
