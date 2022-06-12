package com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern.shapes;

import android.util.Log;

public class RoundedCircle implements Shape {

    private static final String TAG ="" ;

    @Override
    public void draw() {
        //write message in debug log
        Log.d(TAG, " Rounded Circle::draw()");
    }
}