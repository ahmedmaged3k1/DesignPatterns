package com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern;

import android.util.Log;

public class RoundedRectangle implements  Shape{

    private static final String TAG ="" ;

    @Override
    public void draw() {
        //write message in debug log
        Log.d(TAG, "Rounded Rectangle ::draw()");
    }
}