package project.first.epam.babiuk.TicTacToeMemento;


import java.util.ArrayList;
import java.util.List;

public class Memento {
    private static List<char[][]> moveBase = new ArrayList<>();

    public static void save(char[][] newMove) {
        char[][] tempMove = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tempMove[i][j] = newMove[i][j];
            }
        }
        moveBase.add(tempMove);
    }

    public static char[][] backMove() {
     char[][] tempMove = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tempMove[i][j] = moveBase.get(moveBase.size() - 1)[i][j];
            }
        }
        if (moveBase.size() > 1) {
            moveBase.remove(moveBase.size() - 1);
        }
        return tempMove;
    }
}
