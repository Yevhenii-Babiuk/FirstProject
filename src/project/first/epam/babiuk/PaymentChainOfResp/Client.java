package project.first.epam.babiuk.PaymentChainOfResp;


import project.first.epam.babiuk.PaymentChainOfResp.chains.*;
import project.first.epam.babiuk.PaymentChainOfResp.typesOfPayments.*;


public class Client {
    public static void main(String[] args) {
        ChainControler fixation = new Fixation();
        ChainControler control = new Control();
        ChainControler withdraw = new WithdrawInterest();

        fixation.next(control);
        control.next(withdraw);

        TypeOfPayment intrabank = new Intrabank(new Payment(123456789, 8523.87));
        TypeOfPayment preferential = new Preferential(new Payment(741852963, 7854.14));
        TypeOfPayment state = new State(new Payment(369852147, 58093));
        TypeOfPayment usual = new Usual(new Payment(987456321, 90345));


        fixation.makePayment(intrabank);
        fixation.makePayment(preferential);
        fixation.makePayment(state);
        fixation.makePayment(usual);




    }
}
