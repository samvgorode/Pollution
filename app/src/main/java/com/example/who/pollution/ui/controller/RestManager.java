package com.example.who.pollution.ui.controller;

import com.example.who.pollution.ui.callback.PollutionService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by who on 16.12.2016.
 */

public class RestManager {

    PollutionService mPollutionService;

    public PollutionService getPollutionService() {
        if (mPollutionService == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://api.openweathermap.org/pollution/v1/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            mPollutionService = retrofit.create(PollutionService.class);
        }

        return mPollutionService;
    }
}