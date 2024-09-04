package org.strategyDesignPattern;

public class IndianTaxStrategy implements TaxStrategy{
    private static final double GST_RATE = 0.18;

    @Override
    public Double calculateTax(double amount) {
        return amount * GST_RATE;

    }
}
