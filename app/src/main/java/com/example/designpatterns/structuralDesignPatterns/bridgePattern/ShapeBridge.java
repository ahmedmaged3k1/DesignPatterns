package com.example.designpatterns.structuralDesignPatterns.bridgePattern;

public abstract class ShapeBridge {
    protected DrawApi drawApi;
    public  abstract void draw();
    protected ShapeBridge(DrawApi drawApi){
        this.drawApi = drawApi;
    }
}
