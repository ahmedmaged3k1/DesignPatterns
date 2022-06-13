package com.example.designpatterns.behavioralDesignPatterns.iteratorPattern;

public class NameRepository implements Container {
    public String names[] = {"Robert", "John", "Julie", "Lora"};
    private IteratorInterface nameIterator;
    @Override
    public IteratorInterface getIterator() {
        nameIterator = new NameIteratorInterface(names);
        return nameIterator;
    }
}
