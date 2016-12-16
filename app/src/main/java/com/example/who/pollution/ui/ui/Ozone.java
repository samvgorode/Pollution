package com.example.who.pollution.ui.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.who.pollution.R;
import com.example.who.pollution.ui.controller.RestManager;
import com.example.who.pollution.ui.pojo.ozone.OzonePojo;
import com.example.who.pollution.ui.utils.Util;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by who on 16.12.2016.
 */

public class Ozone extends AppCompatActivity {
    OzonePojo ozonePojo;
    TextView mTextView;
    private RestManager mManager;
    final String TAG = Ozone.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mManager = new RestManager();
        setContentView(R.layout.ozone_fragment);
        mTextView = (TextView) findViewById(R.id.ozone);
        loadFeed();
    }

    private void loadFeed() {
        if (isNetworkAvailable()) {
            fillData();
        } else {
            Toast.makeText(getApplicationContext(), "No internet connection",
                    Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Ozone.this, MainActivity.class);
            Ozone.this.startActivity(intent);
        }
    }

    public void fillData() {

        Call<OzonePojo> listCall = mManager.getPollutionService().getOzone();
        listCall.enqueue(new Callback<OzonePojo>() {

            @Override
            public void onResponse(Call<OzonePojo> call, Response<OzonePojo> response) {
                if (response.isSuccessful()) {
                    ozonePojo = response.body();
                    mTextView.setText(ozonePojo.toString());
                } else if (!response.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), "Server error!!!",
                            Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<OzonePojo> call, Throwable t) {
            }
        });


    }

    private boolean isNetworkAvailable() {
        return Util.isNetworkAvailable(getApplicationContext());
    }
}


