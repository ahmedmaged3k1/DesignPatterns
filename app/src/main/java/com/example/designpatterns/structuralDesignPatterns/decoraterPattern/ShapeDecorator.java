package com.example.designpatterns.structuralDesignPatterns.decoraterPattern;

public class ShapeDecorator implements DecoratorShape {
    protected DecoratorShape shape;

    public ShapeDecorator(DecoratorShape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
