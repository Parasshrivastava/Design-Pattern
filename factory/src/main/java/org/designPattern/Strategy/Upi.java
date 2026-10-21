package org.designPattern.Strategy;

public class Upi implements PaymentMethod {
    @Override
    public void ProcessPayment() {
        System.out.println("Payment done using UPI");
    }
}
