package org.strategyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Item> items;
    private TaxStrategy taxStrategy;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculateTotal() {
        double subtotal = items.stream().mapToDouble(Item::getAmount).sum();
        double tax = taxStrategy.calculateTax(subtotal);
        return subtotal + tax;
    }
}
