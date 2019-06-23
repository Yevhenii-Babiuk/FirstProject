package project.first.epam.babiuk.PaymentChainOfResp.chains;


import project.first.epam.babiuk.PaymentChainOfResp.ChainControler;
import project.first.epam.babiuk.PaymentChainOfResp.TypeOfPayment;
import project.first.epam.babiuk.PaymentChainOfResp.typesOfPayments.*;

public class WithdrawInterest implements ChainControler {
    private ChainControler nextInChain;

    @Override
    public void next(ChainControler nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void makePayment(TypeOfPayment payment) {
        if (payment instanceof Usual) {
            System.out.println("Your interest for " + payment.getAmount() + "$ is " + (payment.getAmount() * 0.2));
        } else if (payment instanceof Intrabank) {
            System.out.println("Your interest for " + payment.getAmount() + "$ is " + (payment.getAmount() * 0.1));
        } else if (payment instanceof Preferential) {
            System.out.println("Your interest for " + payment.getAmount() + "$ is " + (payment.getAmount() * 0.05));
        } else {
            System.out.println("Your type is state and you don't need to pay interest for payment");
        }
    }
}
