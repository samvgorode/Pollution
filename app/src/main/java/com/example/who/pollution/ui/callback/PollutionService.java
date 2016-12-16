package com.example.who.pollution.ui.callback;

import com.example.who.pollution.ui.pojo.carbonMonoxide.CarbonMonoxidePojo;
import com.example.who.pollution.ui.pojo.nitrogenDioxide.NitrogenDioxidePojo;
import com.example.who.pollution.ui.pojo.ozone.OzonePojo;
import com.example.who.pollution.ui.pojo.sulfurDioxide.SulfurDioxidePojo;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by who on 16.12.2016.
 */

public interface PollutionService {

    String id = "5966a02d449de50767bdd84b67b13539";

    @GET("o3/0.0,10.0/2016Z.json?appid=" + id)
    Call<OzonePojo> getOzone();


    @GET("so2/0.0,10.0/2016Z.json?appid=" + id)
    Call<SulfurDioxidePojo> getSulfurDioxide();


    @GET("co/0.0,10.0/2016Z.json?appid=" + id)
    Call<CarbonMonoxidePojo> getCarbonMonoxide();

    @GET("no2/0.0,10.0/2016Z.json?appid=" + id)
    Call<NitrogenDioxidePojo> getNitrogenDioxide();
}
