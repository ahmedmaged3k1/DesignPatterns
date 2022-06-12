package com.example.designpatterns.structuralDesignPatterns.bridgePattern;

public class CircleBridge extends ShapeBridge {
    private int x, y, radius;
    public CircleBridge(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public void draw() {
        drawApi.drawCircle(radius,x,y);
    }

}
