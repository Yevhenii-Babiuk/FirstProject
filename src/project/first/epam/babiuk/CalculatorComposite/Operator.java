package project.first.epam.babiuk.CalculatorComposite;

public abstract class Operator implements Calculator {
    public Calculator left;
    public Calculator right;

    public Operator(Calculator left, Calculator right) {
        this.left = left;
        this.right = right;
    }
}
