package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("tvxssy5pVuq1Gn6JjuleRQPdjWJQfiKimx7WHlM4")
                // if defined
                .clientKey("ozWAMr4adKrwBP6lrwOSEzdpUU1hythi4YJT8uQk")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }

    }

