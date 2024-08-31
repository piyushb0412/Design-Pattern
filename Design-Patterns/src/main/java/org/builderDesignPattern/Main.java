package org.builderDesignPattern;

public class Main {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.ComputerBuilder("Intel i5", "8GB","Integrated Card")
                .build();

        // Creating a high-end computer with additional configurations
        Computer gamingComputer = new Computer.ComputerBuilder("Intel i9", "32GB","RTX 4060TI")
                .setStorage("1TB SSD")
                .setBluetoothEnabled(true)
                .setWiFiEnabled(true)
                .build();

        // Printing the created computers
        System.out.println(basicComputer);
        System.out.println(gamingComputer);
    }
}
