package com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern;

import android.util.Log;
import android.widget.Toast;

import com.example.designpatterns.MainActivity;

public class Circle implements  Shape{

    private static final String TAG ="" ;

    @Override
    public void draw() {
       //write message in debug log
        Log.d(TAG, "Circle::draw()");
    }
}