package com.example.who.pollution.ui.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.who.pollution.R;
import com.example.who.pollution.ui.controller.RestManager;
import com.example.who.pollution.ui.pojo.carbonMonoxide.CarbonMonoxidePojo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by who on 16.12.2016.
 */

public class CarbonMonoxide extends AppCompatActivity {
    CarbonMonoxidePojo carbonMonoxidePojo;
    TextView mTextView;
    private RestManager mManager;
    final String TAG = CarbonMonoxide.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mManager = new RestManager();
        setContentView(R.layout.carbon_monoxide_fragment);
        mTextView = (TextView) findViewById(R.id.carbon_monoxide);
        mTextView.setMovementMethod(new ScrollingMovementMethod());
        fillData();
    }


    public void fillData() {

        Call<CarbonMonoxidePojo> listCall = mManager.getPollutionService().getCarbonMonoxide();
        listCall.enqueue(new Callback<CarbonMonoxidePojo>() {

            @Override
            public void onResponse(Call<CarbonMonoxidePojo> call, Response<CarbonMonoxidePojo> response) {
                if (response.isSuccessful()) {
                    carbonMonoxidePojo = response.body();
                    mTextView.setText(carbonMonoxidePojo.toString());
                }
            }

            @Override
            public void onFailure(Call<CarbonMonoxidePojo> call, Throwable t) {

            }
        });
    }
}



