package strategy.impl;

import strategy.DiscountStrategy;

public class LoyalCustomerDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.9;
    }
}
