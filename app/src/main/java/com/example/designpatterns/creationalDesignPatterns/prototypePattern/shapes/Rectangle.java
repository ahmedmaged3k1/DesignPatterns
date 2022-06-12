package com.example.designpatterns.creationalDesignPatterns.prototypePattern.shapes;

import android.util.Log;


public class Rectangle extends PrototypeShape {

    private static final String TAG ="" ;


    @Override
    public void draw() {
        //write message in debug log
        type= "Rectangle";
        Log.d(TAG, "Rectangle Prototype  ::draw()");
    }
}