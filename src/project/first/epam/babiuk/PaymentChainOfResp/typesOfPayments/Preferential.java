package project.first.epam.babiuk.PaymentChainOfResp.typesOfPayments;

import project.first.epam.babiuk.PaymentChainOfResp.Payment;
import project.first.epam.babiuk.PaymentChainOfResp.TypeOfPayment;

public class Preferential implements TypeOfPayment {
    private Payment payment;

    public Preferential(Payment payment) {
        this.payment = payment;
    }

    @Override
    public void getType() {
        System.out.println("Your payment is preferential");
    }

    @Override
    public void getNumber() {
        System.out.println("Your number is "+payment.getNumber());
    }

    @Override
    public double getAmount() {
        return payment.getAmount();
    }
}
