package com.example.designpatterns.creationalDesignPatterns.builderFactoryPattern.items;

public abstract class ColdDrink implements Item {
    @Override
    public  abstract  String name() ;

    @Override
    public String packing() {
        return "Bottle";
    }

    @Override
    public abstract float price() ;

}
