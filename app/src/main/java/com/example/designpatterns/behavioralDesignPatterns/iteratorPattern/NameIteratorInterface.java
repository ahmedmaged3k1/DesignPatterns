package com.example.designpatterns.behavioralDesignPatterns.iteratorPattern;

public class NameIteratorInterface implements IteratorInterface {
    private String[] names;
    private int index;
    public NameIteratorInterface(String[] names){
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        if(index < names.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return names[index++];
        }
        return null;
    }
}
