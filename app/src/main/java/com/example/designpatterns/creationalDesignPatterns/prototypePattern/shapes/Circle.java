package com.example.designpatterns.creationalDesignPatterns.prototypePattern.shapes;

import android.util.Log;


public class Circle extends PrototypeShape {

    private static final String TAG ="" ;


    @Override
    public void draw() {
        //write message in debug log
        type= "Circle";
        Log.d(TAG, "Circle Prototype ::draw()");
    }
}