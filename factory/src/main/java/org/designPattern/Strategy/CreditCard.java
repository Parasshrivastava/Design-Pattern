package org.designPattern.Strategy;

public class CreditCard implements PaymentMethod {
    @Override
    public void ProcessPayment() {
        System.out.println("Payment done using Credit Card");
    }
}
