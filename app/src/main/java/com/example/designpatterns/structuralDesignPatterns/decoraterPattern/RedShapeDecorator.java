package com.example.designpatterns.structuralDesignPatterns.decoraterPattern;

import android.util.Log;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(DecoratorShape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder();
    }

    private void setRedBorder( ) {
        Log.d("TAG", "Decorator RedBorder is being drawn");
    }
}
