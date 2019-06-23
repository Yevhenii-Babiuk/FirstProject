package project.first.epam.babiuk.PaymentChainOfResp.chains;


import project.first.epam.babiuk.PaymentChainOfResp.ChainControler;
import project.first.epam.babiuk.PaymentChainOfResp.TypeOfPayment;

public class Fixation implements ChainControler {
    private ChainControler nextInChain;
    @Override
    public void next(ChainControler nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void makePayment(TypeOfPayment payment) {
        System.out.println("Your payment fixed by bank with next parameters");
        payment.getType();
        payment.getNumber();
        nextInChain.makePayment(payment);
    }
}
