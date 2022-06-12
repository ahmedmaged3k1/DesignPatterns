package com.example.designpatterns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.designpatterns.creationalDesignPatterns.abstractFactoryPattern.AbstractFactory;
import com.example.designpatterns.creationalDesignPatterns.abstractFactoryPattern.FactoryProducer;
import com.example.designpatterns.creationalDesignPatterns.factoryDesignPattern.Shape;
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
}
