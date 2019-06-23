package project.first.epam.babiuk.CalculatorComposite;

public class Value implements Calculator {

    private double value;

    public Value(Double value) {
        this.value = value;
    }

    @Override
    public double calculate() {
        return value;
    }
}
