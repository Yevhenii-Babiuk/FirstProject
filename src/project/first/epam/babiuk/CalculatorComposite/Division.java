package project.first.epam.babiuk.CalculatorComposite;

public class Division extends Operator {

    public Division(Calculator left, Calculator right) {
        super(left, right);
    }

    @Override
    public double calculate() {
        if (right.calculate() == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        return left.calculate() / right.calculate();
    }
}
