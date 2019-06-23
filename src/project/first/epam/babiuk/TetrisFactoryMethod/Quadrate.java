package project.first.epam.babiuk.TetrisFactoryMethod;

public class Quadrate implements Figure {
    private int numberOfCell = 4;

    public Quadrate(int numberOfCell) {
        this.numberOfCell *= numberOfCell;
    }

    @Override
    public void show() {
        System.out.printf("It is quadrate of %d cells\n", numberOfCell);
    }
}
