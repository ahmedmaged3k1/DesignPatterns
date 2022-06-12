package com.example.designpatterns.structuralDesignPatterns.adapterPattern;

import android.util.Log;

import com.example.designpatterns.structuralDesignPatterns.bridgePattern.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    private static final String TAG ="AudioPlayer";
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //inbuilt support to play mp3 music files
        if (audioType.equalsIgnoreCase("mp3")) {
            Log.d(TAG, "Playing mp3 file. Name: " + fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else{
            Log.d(TAG, "Invalid media. " + audioType + " format not supported");
        }
    }
}
