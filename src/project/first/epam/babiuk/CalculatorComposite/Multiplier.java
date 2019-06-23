package project.first.epam.babiuk.CalculatorComposite;

public class Multiplier extends Operator {

    public Multiplier(Calculator left, Calculator right) {
        super(left, right);
    }

    @Override
    public double calculate() {
        return left.calculate() * right.calculate();
    }
}
