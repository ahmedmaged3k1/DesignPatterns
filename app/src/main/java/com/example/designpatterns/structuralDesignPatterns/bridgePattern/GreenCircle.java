package com.example.designpatterns.structuralDesignPatterns.bridgePattern;

import android.util.Log;

public class GreenCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
        Log.d("TAG", "Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }

}
