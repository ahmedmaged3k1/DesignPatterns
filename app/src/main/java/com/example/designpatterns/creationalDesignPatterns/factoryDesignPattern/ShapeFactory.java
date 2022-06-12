package com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern;

import com.example.designpatterns.creationalDesignPatterns.abstractFactoryPattern.AbstractFactory;
import com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern.shapes.Circle;
import com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern.shapes.Rectangle;
import com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern.shapes.Shape;
import com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern.shapes.Sphere;

public class ShapeFactory extends AbstractFactory {
    public Shape getShape (int shapeId)
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
