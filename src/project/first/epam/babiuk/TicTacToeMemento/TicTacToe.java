package project.first.epam.babiuk.TicTacToeMemento;

import java.util.Scanner;

public class TicTacToe {
    public TicTacToe() {
    }

    public void game() {
        Move newMove = new Move();
        int moveCounter = 0;
        newMove.saveMove();
        while (!checkEnd(newMove)) {
            char symbol = moveCounter % 2 == 0 ? 'X' : 'O';
            newMove.saveMove();
            Scanner in = new Scanner(System.in);
            System.out.println("Enter row");
            int row = in.nextByte() - 1;
            System.out.println("Enter column");
            int column = in.nextByte() - 1;
            if (checkCell(newMove, row, column)) {
                newMove.setMove(row, column, symbol);
                print(newMove);
            }
            backMove(newMove, moveCounter);
            moveCounter++;
        }

    }

    public void backMove(Move newMove, int counter) {
        char moveMark = '<';
        int backCounter=1;
        while (moveMark == '<') {
            System.out.println("Press '<' for back move, or '>' for continue");
            Scanner in = new Scanner(System.in);
            moveMark = in.next().charAt(0);
            if (moveMark == '<') {
                if(backCounter==1)newMove.getBackMove();
                else if (backCounter>1){newMove.getBackMove(); newMove.getBackMove();}
                print(newMove);
                backCounter=2;
                counter = counter == 0 ? -1 : counter--;
            } else if (moveMark == '>') {
                newMove.saveMove();
                break;
            }
        }
    }

    public void print(Move newMove) {
        System.out.println(" " + newMove.move[0][0] + " | " + newMove.move[0][1] + " | " + newMove.move[0][2]);
        System.out.println("---+---+---");
        System.out.println(" " + newMove.move[1][0] + " | " + newMove.move[1][1] + " | " + newMove.move[1][2]);
        System.out.println("---+---+---");
        System.out.println(" " + newMove.move[2][0] + " | " + newMove.move[2][1] + " | " + newMove.move[2][2]);
    }

    public boolean checkCell(Move newMove, int x, int y) {
        if (newMove.move[x][y] == ' ')
            return true;
        else {
            System.out.println("Cell is busy");
            return false;
        }
    }

    public boolean checkEnd(Move newMove) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (newMove.move[i][j] == ' ') {
                    return false;
                }
            }
        }
        System.out.println("Game ended");
        return true;
    }

}