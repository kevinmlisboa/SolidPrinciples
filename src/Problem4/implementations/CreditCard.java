package Problem4.implementations;

import Problem4.interfaces.PaymentMethod;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("You are paying using Credit Card");
    }
}
