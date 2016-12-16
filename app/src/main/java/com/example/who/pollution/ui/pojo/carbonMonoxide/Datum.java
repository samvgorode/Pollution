package com.example.who.pollution.ui.pojo.carbonMonoxide;

import com.google.gson.annotations.Expose;

/**
 * Created by who on 16.12.2016.
 */

public class Datum {

    @Expose
    private Float precision;

    @Expose
    private Float pressure;

    @Expose
    private Float value;

    public Float getPrecision() {
        return precision;
    }

    public void setPrecision(Float precision) {
        this.precision = precision;
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\n precision= " + precision +
                "\n pressure= " + pressure +
                "\n value= " + value + "\n";
    }
}

