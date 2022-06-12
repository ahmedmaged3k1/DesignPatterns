package com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern;

import com.example.designpatterns.creationalDesignPatterns.abstractFactoryPattern.AbstractFactory;
import com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern.shapes.RoundedCircle;
import com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern.shapes.RoundedRectangle;
import com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern.shapes.Shape;

public class RoundedShapeFactory extends AbstractFactory {
    public Shape getShape (int shapeId)
    {
        if (shapeId==1)
        {
            return  new RoundedRectangle();
        }
        else if (shapeId==2){
            return  new RoundedCircle();
        }

        return  null ;
    }
}
