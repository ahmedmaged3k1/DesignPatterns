package com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern;

import com.example.designpatterns.creationalDesignPatterns.abstractFactoryPattern.AbstractFactory;

public class ShapeFactory extends AbstractFactory {
    public  Shape getShape (int shapeId)
    {
        if (shapeId==1)
        {
            return  new Rectangle();
        }
        else if (shapeId==2){
            return  new Circle();
        }
        else if (shapeId==3){
            return  new Sphere();
        }
        return  null ;
    }
}