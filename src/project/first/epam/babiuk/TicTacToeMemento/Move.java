package project.first.epam.babiuk.TicTacToeMemento;

public class Move {
    protected  char[][] move = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

    public void setMove(int row, int column, char symbol) {
        move[row][column] = symbol;
    }

    public void saveMove() {
        Memento.save(move);
    }

    public void getBackMove() {
        char[][] tempMove=Memento.backMove();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                move[i][j]=tempMove[i][j];
            }
        }
    }
}

