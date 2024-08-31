package org.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject{
    private int price;
    private String symbol;
    List<Observer> observers;

    public int getPrice() {
        return price;
    }

    public Stock(int price, String symbol) {
        this.price = price;
        this.symbol = symbol;
        this.observers = new ArrayList<>();
    }

    public void setPrice(int price) {
        this.price = price;
        notifyObserver();
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void addObserver(Observer observer) {
     observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
      observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
       for(Observer observer:observers){
           observer.update(this);
       }
    }
}
