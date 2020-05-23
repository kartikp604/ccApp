package com.example.khp.covidapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

//import com.mashape.unirest.http.HttpResponse;
//import com.mashape.unirest.http.Unirest;
//import com.mashape.unirest.http.exceptions.UnirestException;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();

//        Unirest.setTimeouts(0, 0);
//        try {
//            HttpResponse<String> response = Unirest.get("https://api.covid19api.com/")
//                    .asString();
//            Toast.makeText(this, response.getBody(), Toast.LENGTH_SHORT).show();
//        } catch (UnirestException e) {
//            Toast.makeText(this, e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
//        }
    }
}
