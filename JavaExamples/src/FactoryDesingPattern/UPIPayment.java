package FactoryDesingPattern;

public class UPIPayment implements Payment {

    @Override
    public void pay(Double amount) {
        System.out.println("Payment is done be UPI " + amount);
    }
}