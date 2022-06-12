package com.example.designpatterns.creationalDesignPatterns.builderFactoryPattern.items;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }

}
