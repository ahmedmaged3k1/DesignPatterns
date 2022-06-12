package com.example.designpatterns.creationalDesignPatterns.abstractFactoryPattern;

import com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(int shapeType);
}
