package com.example.designpatterns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.designpatterns.creationalDesignPatterns.abstractFactoryPattern.AbstractFactory;
import com.example.designpatterns.creationalDesignPatterns.abstractFactoryPattern.FactoryProducer;
import com.example.designpatterns.creationalDesignPatterns.builderFactoryPattern.Meal;
import com.example.designpatterns.creationalDesignPatterns.builderFactoryPattern.MealBuilder;
import com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern.shapes.Shape;
import com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern.ShapeFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private  void factoryPattern()
    {
        //create a factory object
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.getShape(1);
        Shape  circle = shapeFactory.getShape(1);
        Shape  sphere = shapeFactory.getShape(1);

    }
    private  void abstractFactoryPattern()
    {
        //create an abstract factory object
        AbstractFactory shapeFactory = FactoryProducer.getFactory(2);
        Shape roundedCircle = shapeFactory.getShape(2);

    }
    private  void BuilderPattern()
    {
        MealBuilder mealBuilder = new MealBuilder();
        Meal beefMeal = mealBuilder.prepareBeefMeal();
        System.out.println("Veg Meal");
        beefMeal.showItems();
        System.out.println("Total Cost: " + beefMeal.getCost());
        Meal chickenMeal = mealBuilder.prepareChickenMeal();
        System.out.println("\n\nNon-Veg Meal");
        chickenMeal.showItems();
        System.out.println("Total Cost: " + chickenMeal.getCost());
    }
}
