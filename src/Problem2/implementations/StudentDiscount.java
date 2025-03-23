package Problem2.implementations;

import Problem2.interfaces.DiscountStrategy;

public class StudentDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.05;
    }
}