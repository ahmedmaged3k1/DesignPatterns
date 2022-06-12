package com.example.designpatterns.creationalDesignPatterns.prototypePattern.shapes;

import android.util.Log;


public class Sphere extends PrototypeShape {

    private static final String TAG ="" ;


    @Override
    public void draw() {
        //write message in debug log
        type= "Sphere";
        Log.d(TAG, "Sphere Prototype ::draw()");
    }
}