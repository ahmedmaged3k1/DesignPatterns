package com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern;

import android.util.Log;

public class Sphere  implements  Shape{
    private static final String TAG ="" ;

    @Override
    public void draw() {
        //write message in debug log
        Log.d(TAG, "Sphere ::draw()");
    }
}
