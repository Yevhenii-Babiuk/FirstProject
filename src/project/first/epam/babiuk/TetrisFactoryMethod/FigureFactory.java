package project.first.epam.babiuk.TetrisFactoryMethod;

public class FigureFactory {

    public Figure getFigure(String figureType)
            throws FigureTypeNotFoundException {
        if (figureType == null)
            return null;
        Figure figure = null;
        int size =1+(int)(Math.random()*2);
        switch (figureType) {
            case "Quadrate":
                figure = new Quadrate(size);
                break;
            case "Line":
                figure = new Line(size);
                break;
            case "Zigzag":
                figure = new Zigzag(size);
                break;
            default:
                throw new FigureTypeNotFoundException();
        }
        return figure;
    }
}
