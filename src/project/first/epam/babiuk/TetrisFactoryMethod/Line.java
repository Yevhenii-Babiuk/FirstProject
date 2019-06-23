package project.first.epam.babiuk.TetrisFactoryMethod;

public class Line implements Figure {
    private int numberOfCell = 5;

    public Line(int numberOfCell) {
        this.numberOfCell *= numberOfCell;
    }
    @Override
    public void show() {
        System.out.printf("It is line of %d cells\n", numberOfCell);

    }
}
