package org.observerDesignPattern;

public class PriceDisplay implements Observer{
    @Override
    public void update(Stock stock) {
        System.out.println("stock price display: "+ stock.getPrice() + " stock symbol : " + stock.getSymbol());
    }
}
