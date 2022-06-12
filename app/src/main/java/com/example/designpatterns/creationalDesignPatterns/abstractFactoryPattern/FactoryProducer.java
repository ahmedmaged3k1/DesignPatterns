package com.example.designpatterns.creationalDesignPatterns.abstractFactoryPattern;

import com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern.RoundedShapeFactory;
import com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(int choice) {
        if (choice == 1) {
            return new ShapeFactory();
        } else if (choice == 2) {
            return new RoundedShapeFactory();
        }
        return null;
    }
}

