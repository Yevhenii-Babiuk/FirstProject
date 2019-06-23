package project.first.epam.babiuk.PaymentChainOfResp;

public interface ChainControler {
    void next(ChainControler chain);

    void makePayment(TypeOfPayment payment);
}
