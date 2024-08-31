package org.builderDesignPattern;

public class Computer {
    private String RAM;
    private String CPU;
    private String GPU;

    // Optional parameters
    private String storage;
    private boolean isBluetoothEnabled;
    private boolean isWiFiEnabled;

    // Private constructor to prevent direct instantiation
    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.GPU = builder.GPU;
        this.storage = builder.storage;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isWiFiEnabled = builder.isWiFiEnabled;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", GPU=" + GPU +
                ", storage=" + storage + ", Bluetooth=" + isBluetoothEnabled +
                ", WiFi=" + isWiFiEnabled + "]";
    }

    // Builder Class
    public static class ComputerBuilder {
        // Required parameters
        private String CPU;
        private String RAM;
        private String GPU;

        // Optional parameters
        private String storage;
        private boolean isBluetoothEnabled;
        private boolean isWiFiEnabled;

        // Constructor for required parameters
        public ComputerBuilder(String CPU, String RAM, String GPU) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.GPU=  GPU;
        }

        // Setter methods for optional parameters
        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public ComputerBuilder setWiFiEnabled(boolean isWiFiEnabled) {
            this.isWiFiEnabled = isWiFiEnabled;
            return this;
        }

        // Build method to create the final Computer object
        public Computer build() {
            return new Computer(this);
        }
    }
}
