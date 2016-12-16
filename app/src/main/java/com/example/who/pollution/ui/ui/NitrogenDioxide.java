package com.example.who.pollution.ui.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.who.pollution.R;
import com.example.who.pollution.ui.controller.RestManager;
import com.example.who.pollution.ui.pojo.nitrogenDioxide.NitrogenDioxidePojo;
import com.example.who.pollution.ui.utils.Util;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by who on 16.12.2016.
 */

public class NitrogenDioxide extends AppCompatActivity {
    NitrogenDioxidePojo nitrogenDioxidePojo;
    TextView mTextView;
    private RestManager mManager;
    final String TAG = NitrogenDioxide.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mManager = new RestManager();
        setContentView(R.layout.nitrogen_dioxide_fragment);
        mTextView = (TextView) findViewById(R.id.nitrogen_dioxide);
        loadFeed();
    }

    private void loadFeed() {
        if (isNetworkAvailable()) {
            fillData();
        } else {
            Toast.makeText(getApplicationContext(), "No internet connection",
                    Toast.LENGTH_LONG).show();
            Intent intent = new Intent(NitrogenDioxide.this, MainActivity.class);
            NitrogenDioxide.this.startActivity(intent);
        }
    }

    public void fillData() {

        Call<NitrogenDioxidePojo> listCall = mManager.getPollutionService().getNitrogenDioxide();
        listCall.enqueue(new Callback<NitrogenDioxidePojo>() {

            @Override
            public void onResponse(Call<NitrogenDioxidePojo> call, Response<NitrogenDioxidePojo> response) {
                if (response.isSuccessful()) {
                    nitrogenDioxidePojo = response.body();
                    mTextView.setText(nitrogenDioxidePojo.toString());
                } else if (!response.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), "Server error!!!",
                            Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<NitrogenDioxidePojo> call, Throwable t) {
            }


        });
    }

    private boolean isNetworkAvailable() {
        return Util.isNetworkAvailable(getApplicationContext());
    }
}
