package org.bridgeDesignPattern;

public class Windows extends OperatingSystem{

    Windows(AudioFormat audioFormat) {
        super(audioFormat);
    }

    @Override
    void playAudio(String filename) {
        System.out.println("Running on windows");
        audioFormat.play(filename);
    }
}
