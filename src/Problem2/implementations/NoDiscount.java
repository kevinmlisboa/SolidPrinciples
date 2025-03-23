package Problem2.implementations;

import Problem2.interfaces.DiscountStrategy;

public class NoDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return 0.0;  
    }
}