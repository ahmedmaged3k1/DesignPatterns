package com.example.designpatterns.structuralDesignPatterns.adapterPattern;

import com.example.designpatterns.structuralDesignPatterns.adapterPattern.AdvancedMediaPlayer;

public class VlcPLayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing Vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }

}
