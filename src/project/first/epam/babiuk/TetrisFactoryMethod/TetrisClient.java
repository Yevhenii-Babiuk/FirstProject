package project.first.epam.babiuk.TetrisFactoryMethod;

public class TetrisClient {
    public static void main(String[] args) {

        FigureFactory type = new FigureFactory();
        for (int i = 0; i < 5; i++) {
            int figureIndex = (int) (Math.random() * 2);
            String figureType = (TypesOfFigures.values()[figureIndex]).toString();
            try {
                Figure figure = type.getFigure(figureType);
                figure.show();
            } catch (FigureTypeNotFoundException exeption) {
                System.out.println("Incorect figure type");
            }
        }
    }
}
