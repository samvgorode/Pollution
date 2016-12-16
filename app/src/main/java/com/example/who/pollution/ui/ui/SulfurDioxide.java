package com.example.who.pollution.ui.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.who.pollution.R;
import com.example.who.pollution.ui.controller.RestManager;
import com.example.who.pollution.ui.pojo.sulfurDioxide.SulfurDioxidePojo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by who on 16.12.2016.
 */

public class SulfurDioxide extends AppCompatActivity {
    TextView mTextView;
    ArrayAdapter<String> mAdapter;
    SulfurDioxidePojo sulfurDioxidePojo;
    private RestManager mManager;
    final String TAG = SulfurDioxide.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mManager = new RestManager();
        setContentView(R.layout.sulfur_dioxide_fragment);
        mTextView = (TextView) findViewById(R.id.sulfur);
        mTextView.setMovementMethod(new ScrollingMovementMethod());
        fillData();


    }

    public void fillData() {

        Call<SulfurDioxidePojo> listCall = mManager.getPollutionService().getSulfurDioxide();
        listCall.enqueue(new Callback<SulfurDioxidePojo>() {

            @Override
            public void onResponse(Call<SulfurDioxidePojo> call, Response<SulfurDioxidePojo> response) {
                if (response.isSuccessful()) {
                    sulfurDioxidePojo = response.body();
                    mTextView.setText(sulfurDioxidePojo.toString());


                }
            }

            @Override
            public void onFailure(Call<SulfurDioxidePojo> call, Throwable t) {

            }
        });


    }
}