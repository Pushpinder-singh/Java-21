package FactoryDesingPattern;

public class PayPalPayment implements Payment {

    @Override
    public void pay(Double amount) {
        System.out.println("Payment is done be PayPal " + amount);
    }

}
