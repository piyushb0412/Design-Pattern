package org.strategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new Item(299.2,"Jeans"));
        order.addItem(new Item(399,"Shirt"));

        order.setTaxStrategy(new USTaxStrategy());
        System.out.println(order.calculateTotal());

        order.setTaxStrategy(new IndianTaxStrategy());
        System.out.println(order.calculateTotal());
    }
}
