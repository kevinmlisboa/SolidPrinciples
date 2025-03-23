package Problem2;

import Problem2.interfaces.DiscountStrategy;

public class Customer {
    private String name;
    private DiscountStrategy discountStrategy;

    public Customer(String name, DiscountStrategy discountStrategy) {
        this.name = name;
        this.discountStrategy = discountStrategy;
    }
    public String getName() {
        return name;
    }
    public double applyDiscount(double amount) {
        return amount - discountStrategy.calculateDiscount(amount);
    }
}