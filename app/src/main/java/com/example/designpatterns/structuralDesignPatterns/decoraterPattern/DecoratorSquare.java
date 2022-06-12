package com.example.designpatterns.structuralDesignPatterns.decoraterPattern;

import android.util.Log;

public class DecoratorSquare implements DecoratorShape {

    @Override
    public void draw() {
        Log.d("TAG", "Decorator Square is being drawn");
    }

}
