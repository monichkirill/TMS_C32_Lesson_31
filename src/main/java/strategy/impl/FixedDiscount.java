package strategy.impl;

import strategy.DiscountStrategy;

public class FixedDiscount implements DiscountStrategy {
    private final double discount;

    public FixedDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double applyDiscount(double price) {
        return price - discount;
    }
}
