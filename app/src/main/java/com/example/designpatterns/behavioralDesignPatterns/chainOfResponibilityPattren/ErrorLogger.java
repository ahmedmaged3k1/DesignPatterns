package com.example.designpatterns.behavioralDesignPatterns.chainOfResponibilityPattren;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Standard Erorr::Logger: " +
                message);
    }
}