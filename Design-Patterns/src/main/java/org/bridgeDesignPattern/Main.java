package org.bridgeDesignPattern;

public class Main {
    public static void main(String[] args) {
        OperatingSystem operatingSystem=new Windows(new MP3AudioFormat());
        operatingSystem.playAudio("Rockstar.mp3");
    }
}
