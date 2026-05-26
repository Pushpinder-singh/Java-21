package FactoryDesingPattern;

public class ClientMain {

    public static void main(String[] args) {
        Payment payment = PaymentFactory.getPayment("Paypal");
        payment.pay(6000.0);
    }

}

/*
 * Factory Pattern encapsulates object creation logic and helps
 * achieve loose coupling, scalability, and maintainability in large
 * applications.
 */