package com.example.designpatterns.structuralDesignPatterns.bridgePattern;

import android.util.Log;

public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
        Log.d("RedCircle", "Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }

}
