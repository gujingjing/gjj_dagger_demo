package com.example.ibesteeth.gjj_dagger_demo;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject ApiService apiService;

    private AppComponent appComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appComponent=AppApplication.get(this).getAppComponent();
        apiService=appComponent.getService();

        Toast.makeText(this,apiService.name,Toast.LENGTH_SHORT).show();

        Log.e("apiService===",apiService.name);
    }
}
