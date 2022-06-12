package com.example.designpatterns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.designpatterns.creationalDesignPatterns.abstractFactoryPattern.AbstractFactory;
import com.example.designpatterns.creationalDesignPatterns.abstractFactoryPattern.FactoryProducer;
import com.example.designpatterns.creationalDesignPatterns.builderFactoryPattern.Meal;
import com.example.designpatterns.creationalDesignPatterns.builderFactoryPattern.MealBuilder;
import com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern.shapes.Shape;
import com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern.ShapeFactory;
import com.example.designpatterns.creationalDesignPatterns.prototypePattern.ShapeCache;
import com.example.designpatterns.creationalDesignPatterns.prototypePattern.shapes.Circle;
import com.example.designpatterns.creationalDesignPatterns.prototypePattern.shapes.PrototypeShape;
import com.example.designpatterns.creationalDesignPatterns.prototypePattern.shapes.Rectangle;
import com.example.designpatterns.creationalDesignPatterns.prototypePattern.shapes.Sphere;
import com.example.designpatterns.creationalDesignPatterns.singeltonPattern.Singleton;
import com.example.designpatterns.structuralDesignPatterns.bridgePattern.CircleBridge;
import com.example.designpatterns.structuralDesignPatterns.bridgePattern.GreenCircle;
import com.example.designpatterns.structuralDesignPatterns.bridgePattern.RedCircle;
import com.example.designpatterns.structuralDesignPatterns.bridgePattern.ShapeBridge;
import com.example.designpatterns.structuralDesignPatterns.decoraterPattern.DecoratorCircle;
import com.example.designpatterns.structuralDesignPatterns.decoraterPattern.DecoratorShape;
import com.example.designpatterns.structuralDesignPatterns.decoraterPattern.DecoratorSquare;
import com.example.designpatterns.structuralDesignPatterns.decoraterPattern.RedShapeDecorator;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prototypePattern();
        builderPattern();
        abstractFactoryPattern();
        factoryPattern();
        singletonPattern();
        bridgePattern();
        decoratorPattern();
    }

    private  void factoryPattern()
    {
        //create a factory object
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.getShape(1);
        Shape  circle = shapeFactory.getShape(1);
        Shape  sphere = shapeFactory.getShape(1);
        sphere.draw();
        rectangle.draw();
        circle.draw();

    }
    private  void abstractFactoryPattern()
    {
        //create an abstract factory object
        AbstractFactory shapeFactory = FactoryProducer.getFactory(2);
        Shape roundedCircle = shapeFactory.getShape(2);
        roundedCircle.draw();

    }
    private  void builderPattern()
    {
        MealBuilder mealBuilder = new MealBuilder();
        Meal beefMeal = mealBuilder.prepareBeefMeal();
        System.out.println("Veg Meal");
        beefMeal.showItems();
        System.out.println();
        Log.d(TAG, "Total Cost: " + beefMeal.getCost());
        Meal chickenMeal = mealBuilder.prepareChickenMeal();
        Log.d(TAG, "\n\nNon-Veg Meal");
        chickenMeal.showItems();
        Log.d(TAG, "Total Cost: " + chickenMeal.getCost());
    }
    private  void prototypePattern()
    {
        //create a prototype object
        ShapeCache.loadShapes();
        //get the prototype object
        PrototypeShape clonedShape = (PrototypeShape) ShapeCache.getShape("1");
        clonedShape.draw();
        Log.d(TAG, "Prototype  Shape : " + clonedShape.getType());
        PrototypeShape clonedShape2 = (PrototypeShape) ShapeCache.getShape("2");
        clonedShape2.draw();
        Log.d(TAG, "Prototype Shape : " + clonedShape2.getType());
        PrototypeShape clonedShape3 = (PrototypeShape) ShapeCache.getShape("3");
        clonedShape3.draw();
        Log.d(TAG, "Prototype Shape : " + clonedShape3.getType());
    }
    private  void singletonPattern()
    {
        //create a singleton object
        Singleton singleton = Singleton.getInstance();
        //get the singleton object
    }
    private void bridgePattern()
    {
        //create a bridge object
        ShapeBridge redCircle = new CircleBridge(100,100, 10, new RedCircle());
        ShapeBridge greenCircle = new CircleBridge(100,100, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
    private void decoratorPattern()
    {
        //create a decorator object
        DecoratorShape circle = new DecoratorCircle();
        DecoratorShape redCircle = new RedShapeDecorator(new DecoratorCircle());
        DecoratorShape redRectangle = new RedShapeDecorator(new DecoratorSquare());
        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("\nCircle of red border");
        redCircle.draw();
        System.out.println("\nSquare of red border");
        redRectangle.draw();
    }
}
