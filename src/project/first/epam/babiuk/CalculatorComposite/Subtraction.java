package project.first.epam.babiuk.CalculatorComposite;

public class Subtraction extends Operator {

    public Subtraction(Calculator left, Calculator right) {
        super(left, right);
    }

    @Override
    public double calculate() {
        return left.calculate() - right.calculate();
    }
}
