package project.first.epam.babiuk.TetrisFactoryMethod;

public class Zigzag implements Figure {
    private int numberOfCell = 6;

    public Zigzag (int numberOfCell) {
        this.numberOfCell *= numberOfCell;
    }

    @Override
    public void show() {
        System.out.printf("It is zigzag of %d cells\n", numberOfCell);
    }
}
