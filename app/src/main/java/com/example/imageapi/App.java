package com.example.imageapi;

import android.app.Application;

import com.example.imageapi.components.ComponentProvider;
import com.example.imageapi.components.Injection;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Injection.setProvider(new ComponentProvider(this));

    }
}
