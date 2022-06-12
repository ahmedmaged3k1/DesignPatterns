package com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern;

public class ShapeFactory {
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
