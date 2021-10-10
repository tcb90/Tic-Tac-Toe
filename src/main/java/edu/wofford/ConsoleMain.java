package edu.wofford;
import java.util.Objects;
import java.util.Scanner;

public class ConsoleMain {
    boolean xTurn = true;
    boolean gameEnd = false;
    int count = 0;
    private String[][] spots = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
    private String board = spots[0][0] + "|" + spots[0][1] + "|" + spots[0][2]
            + "\n" + "-----" + "\n" + spots[1][0] + "|" + spots[1][1]
            + "|" + spots[1][2] + "\n" + "-----" + "\n" + spots[2][0] + "|"
            + spots[2][1] + "|" + spots[2][2];

    private void setBoard() {
        board = spots[0][0] + "|" + spots[0][1] + "|" + spots[0][2]
                + "\n" + "-----" + "\n" + spots[1][0] + "|" + spots[1][1]
                + "|" + spots[1][2] + "\n" + "-----" + "\n" + spots[2][0] + "|"
                + spots[2][1] + "|" + spots[2][2];
    }

    private void endCheck(int x, int y) {
        if (!xTurn) {
            //X win start
            //X horizontal
            for (int i = 0; i <= 2; i++) {
                if (!Objects.equals(spots[x][i], "X")) {
                    break;
                }
                if (i == 2) {
                    gameEnd = true;
                    setBoard();
                    System.out.println(board);
                    System.out.println("X Wins");
                    return;
                }
            }
            //X Vertical
            for (int i = 0; i <= 2; i++) {
                if (!Objects.equals(spots[i][y], "X")) {
                    break;
                }
                if (i == 2) {
                    gameEnd = true;
                    setBoard();
                    System.out.println(board);
                    System.out.println("X Wins");
                    return;
                }
            }
            //X Diagonal
            if (x == y) {
                for (int i = 0; i <= 2; i++) {
                    if (!Objects.equals(spots[i][i], "X")) {
                        break;
                    }
                    if (i == 2) {
                        gameEnd = true;
                        setBoard();
                        System.out.println(board);
                        System.out.println("X Wins");
                        return;
                    }
                }
            }
            //X other Diagonal
            if (x + y == 2) {
                for (int i = 0; i <= 2; i++) {
                    if (!Objects.equals(spots[i][2 - i], "X")) {
                        break;
                    }
                    if (i == 2) {
                        gameEnd = true;
                        setBoard();
                        System.out.println(board);
                        System.out.println("X Wins");
                        return;
                    }
                }
            }
            //Tie check
            if (count == 9) {
                gameEnd = true;
                setBoard();
                System.out.println(board);
                System.out.println("Tie");
            }
            //X win end
        } else if (xTurn) {
            //O win start
            //O horizontal
            for (int i = 0; i <= 2; i++) {
                if (!Objects.equals(spots[x][i], "O")) {
                    break;
                }
                if (i == 2) {
                    gameEnd = true;
                    setBoard();
                    System.out.println(board);
                    System.out.println("O Wins");
                    return;
                }
            }
            //O Vertical
            for (int i = 0; i <= 2; i++) {
                if (!Objects.equals(spots[i][y], "O")) {
                    break;
                }
                if (i == 2) {
                    gameEnd = true;
                    setBoard();
                    System.out.println(board);
                    System.out.println("O Wins");
                    return;
                }
            }
            //O Diagonal
            if (x == y) {
                for (int i = 0; i <= 2; i++) {
                    if (!Objects.equals(spots[i][i], "O")) {
                        break;
                    }
                    if (i == 2) {
                        gameEnd = true;
                        setBoard();
                        System.out.println(board);
                        System.out.println("O Wins");
                        return;
                    }
                }
            }
            //O other Diagonal
            if (x + y == 2) {
                for (int i = 0; i <= 2; i++) {
                    if (!Objects.equals(spots[i][2 - i], "O")) {
                        break;
                    }
                    if (i == 2) {
                        gameEnd = true;
                        setBoard();
                        System.out.println(board);
                        System.out.println("O Wins");
                        return;
                    }
                }
            }
            //Tie check
            if (count == 9) {
                gameEnd = true;
                setBoard();
                System.out.println(board);
                System.out.println("Tie");
            }
            //O win end
        }
    }

    private void gameTurn(int x, int y) {
        if (xTurn) {
            if (Objects.equals(spots[x][y], " ")) {
                spots[x][y] = "X";
                xTurn = false;
                count++;
                setBoard();
                System.out.println(board);
            }
        } else {
            if (Objects.equals(spots[x][y], " ")) {
                spots[x][y] = "O";
                xTurn = true;
                count++;
                setBoard();
                System.out.println(board);
            }
        }
        endCheck(x, y);
    }

    public static void main(String[] args) {
        ConsoleMain console = new ConsoleMain();
        Scanner keyboard = new Scanner(System.in);
        int x = 0;
        int y = 0;
        System.out.println(console.board);
        while (!console.gameEnd) {
            x = keyboard.nextInt();
            y = keyboard.nextInt();
            if (x > -1 && x < 3 && y > -1 && y < 3) {
                console.gameTurn(x, y);
            }
        }
        keyboard.close();
    }
}
