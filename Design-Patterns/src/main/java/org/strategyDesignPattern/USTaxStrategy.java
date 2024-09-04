package org.strategyDesignPattern;

public class USTaxStrategy implements TaxStrategy{

    private static final double TAX_RATE = 0.07;

    @Override
    public Double calculateTax(double amount) {
        return amount * TAX_RATE;
    }
}
