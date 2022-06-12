package com.example.designpatterns.creationalDesignPatterns.builderFactoryPattern;

import com.example.designpatterns.creationalDesignPatterns.builderFactoryPattern.items.BeefBurger;
import com.example.designpatterns.creationalDesignPatterns.builderFactoryPattern.items.ChickenBurger;
import com.example.designpatterns.creationalDesignPatterns.builderFactoryPattern.items.Pepsi;
import com.example.designpatterns.creationalDesignPatterns.builderFactoryPattern.items.Seven;

public class MealBuilder {
    public Meal prepareChickenMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareBeefMeal() {
        Meal meal = new Meal();
        meal.addItem(new BeefBurger());
        meal.addItem(new Seven());
        return meal;
    }

}
