package org.bridgeDesignPattern;

abstract class OperatingSystem {

    protected AudioFormat audioFormat;
    OperatingSystem(AudioFormat audioFormat){
        this.audioFormat=audioFormat;
    }
    abstract void playAudio(String filename);
}
