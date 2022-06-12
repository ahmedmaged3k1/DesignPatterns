package com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern;

import com.example.designpatterns.creationalDesignPatterns.abstractFactoryPattern.AbstractFactory;

public class RoundedShapeFactory extends AbstractFactory {
    public  Shape getShape (int shapeId)
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
