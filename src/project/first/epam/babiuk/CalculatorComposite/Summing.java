package project.first.epam.babiuk.CalculatorComposite;

public class Summing extends Operator {

    public Summing(Calculator left, Calculator right) {
        super(left, right);
    }

    @Override
    public double calculate() {
        return left.calculate() + right.calculate();
    }
}
