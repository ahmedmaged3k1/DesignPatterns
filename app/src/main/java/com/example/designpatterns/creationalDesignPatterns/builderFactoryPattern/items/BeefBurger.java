package com.example.designpatterns.creationalDesignPatterns.builderFactoryPattern.items;

public class BeefBurger extends Burger {
    @Override
    public String name() {
        return "Beef Burger";
    }

    @Override
    public float price() {
        return 3.5f;
    }

}
