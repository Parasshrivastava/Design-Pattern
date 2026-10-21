package org.designPattern.Strategy;

public class DebitCard implements PaymentMethod {
    @Override
    public void ProcessPayment() {
        System.out.println("Payment done using Debit Card");
    }
}
