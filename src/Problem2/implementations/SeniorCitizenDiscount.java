package Problem2.implementations;

import Problem2.interfaces.DiscountStrategy;

public class SeniorCitizenDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10;
    }
}