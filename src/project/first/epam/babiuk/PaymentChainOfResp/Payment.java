package project.first.epam.babiuk.PaymentChainOfResp;

public class Payment {
    private long Number;
    private double amount;

    public Payment(long Number, double amount) {
        this.Number = Number;
        this.amount = amount;
    }

    public long getNumber() {
        return Number;
    }

    public double getAmount() {
        return amount;
    }
}
