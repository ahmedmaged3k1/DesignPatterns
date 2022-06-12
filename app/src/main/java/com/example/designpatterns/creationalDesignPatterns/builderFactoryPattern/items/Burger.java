package com.example.designpatterns.creationalDesignPatterns.builderFactoryPattern.items;

public abstract class Burger implements Item {
    @Override
    public abstract  String name() ;
    @Override
    public String packing() {
        return "Wrapper";
    }

    @Override
    public abstract float price() ;

}
