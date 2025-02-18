package strategy.impl;

import strategy.DiscountStrategy;

public class PriceCalculator{
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculatePrice(double price) {
        return discountStrategy != null ? discountStrategy.applyDiscount(price) : price;
    }
}
