package org.observerDesignPattern;

public class Main {
    public static void main(String[] args) {
        Stock googleStock = new Stock(30, "GOOG");
        Observer priceDisplay=new PriceDisplay();

        googleStock.addObserver(priceDisplay);

        System.out.println("First Price Update:");
        googleStock.setPrice(102); // This will notify all observers

        System.out.println("\nSecond Price Update:");
        googleStock.setPrice(96); // This will notify all observers again

    }
}
