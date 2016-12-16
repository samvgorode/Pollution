package com.example.who.pollution.ui.pojo.nitrogenDioxide;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

/**
 * Created by who on 16.12.2016.
 */

public class No2Trop implements Serializable {

    @Expose
    private Double precision;

    @Expose
    private Double value;

    public Double getPrecision() {
        return precision;
    }

    public void setPrecision(Double precision) {
        this.precision = precision;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nprecision=" + precision +
                "\n value=" + value +"\n";
    }
}
