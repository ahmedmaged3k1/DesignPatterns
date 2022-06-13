package com.example.designpatterns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.designpatterns.behavioralDesignPatterns.iteratorPattern.IteratorInterface;
import com.example.designpatterns.behavioralDesignPatterns.iteratorPattern.NameRepository;
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
import com.example.designpatterns.structuralDesignPatterns.bridgePattern.AudioPlayer;

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
        adapterPattern();
        iteratorPattern();
    }

    private  void factoryPattern()
    {
        //create a factory object
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.getShape(1);
        Shape  circle = shapeFactory.getShape(1);
        Shape  sphere = shapeFactory.getShape(1);

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
    }
    private void adapterPattern()
    {
        //create an adapter object
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
                audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
        //create a client object
    }
    private void iteratorPattern() {
        //create a collection object
        NameRepository namesRepository = new NameRepository();
        for(IteratorInterface iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String) iter.next();
            System.out.println("Name: " + name);
        }
    }
}
