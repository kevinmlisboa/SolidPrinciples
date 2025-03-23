import Problem4.PaymentProcessor;
import Problem4.implementations.CashPayment;
import Problem4.implementations.CreditCard;
import Problem4.implementations.EWallet;

public class Prob4 {
    public static void main(String[] args) {
        double amount = 500.0;

        PaymentProcessor eWalletProcessor = new PaymentProcessor(new EWallet());
        eWalletProcessor.processPayment(amount);

        PaymentProcessor creditCardProcessor = new PaymentProcessor(new CreditCard());
        creditCardProcessor.processPayment(amount);

        PaymentProcessor cashProcessor = new PaymentProcessor(new CashPayment());
        cashProcessor.processPayment(amount);
    }
}
