package com.example.designpatterns.creationalDesignPatterns.prototypePattern;

import com.example.designpatterns.creationalDesignPatterns.prototypePattern.shapes.Circle;
import com.example.designpatterns.creationalDesignPatterns.prototypePattern.shapes.PrototypeShape;
import com.example.designpatterns.creationalDesignPatterns.prototypePattern.shapes.Rectangle;
import com.example.designpatterns.creationalDesignPatterns.prototypePattern.shapes.Sphere;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, PrototypeShape> shapeMap = new
            Hashtable<String, PrototypeShape>();
    public static PrototypeShape getShape(String shapeId) {
        PrototypeShape cachedShape = shapeMap.get(shapeId);
        return (PrototypeShape) cachedShape.clone();
    }
    public  static void loadShapes()
    {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);
        Sphere sphere = new Sphere();
        sphere.setId("2");
        shapeMap.put(sphere.getId(),sphere);
        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }

}
