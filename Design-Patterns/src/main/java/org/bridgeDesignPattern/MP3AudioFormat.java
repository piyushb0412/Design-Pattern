package org.bridgeDesignPattern;

public class MP3AudioFormat implements AudioFormat{
    @Override
    public void play(String filename) {
        System.out.println("playing in MP3 format");
    }
}
