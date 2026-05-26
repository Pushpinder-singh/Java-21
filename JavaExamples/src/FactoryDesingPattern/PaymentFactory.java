package FactoryDesingPattern;

public class PaymentFactory {

    public static Payment getPayment(String type) {

        if (type.equalsIgnoreCase("UPI")) {
            return new UPIPayment();
        }
        if (type.equalsIgnoreCase("Paypal")) {
            return new PayPalPayment();
        }
        throw new IllegalArgumentException("Invlaid payment type");
    }

}
