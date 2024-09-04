package org.strategyDesignPattern;

public class Item {

    public double amount;
    public String itemName;

    public Item(double amount, String itemName) {
        this.amount = amount;
        this.itemName = itemName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
