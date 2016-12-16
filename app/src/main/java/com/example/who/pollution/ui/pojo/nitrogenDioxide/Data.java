package com.example.who.pollution.ui.pojo.nitrogenDioxide;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

/**
 * Created by who on 16.12.2016.
 */

public class Data implements Serializable {
    @Expose
    private No2 no2;
    @Expose
    private No2Strat no2_strat;
    @Expose
    private No2Trop no2_trop;

    public No2 getNo2() {
        return no2;
    }

    public void setNo2(No2 no2) {
        this.no2 = no2;
    }

    public No2Strat getNo2Strat() {
        return no2_strat;
    }

    public void setNo2Strat(No2Strat no2Strat) {
        this.no2_strat = no2Strat;
    }

    public No2Trop getNo2Trop() {
        return no2_trop;
    }

    public void setNo2Trop(No2Trop no2Trop) {
        this.no2_trop = no2Trop;
    }

    @Override
    public String toString() {
        return "\n No2= " + no2 +
                "\n No2Strat= " + no2_strat +
                "\n No2Trop= " + no2_trop + "\n";
    }
}
