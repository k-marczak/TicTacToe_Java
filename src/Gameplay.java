import java.util.Random;
import java.util.Scanner;

public class Gameplay {


    char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};


    public Gameplay() {

        while (true) {

            playerMove(board);
            computerMove(board);
        }


    }

    // Computer MOVE METHOD
    public static void computerMove(char[][] board) {
        Random random = new Random();
        int compMove;

        while (true) {
            compMove = random.nextInt(9) + 1;
            if (isValidMove(board, compMove)) {
                break;
            }
        }
        System.out.println("Computer choose: " + compMove);
        placeMove(board, compMove, 'O');
        printBoard(board);
    }


    // PLAYER TURN METHOD
    public static void playerMove(char[][] board) {
        Scanner scanner = new Scanner(System.in);
        int positionPick;

        while (true) {
            printBoard(board);
            System.out.println("Pick your position (1 - 9): ");
            positionPick = scanner.nextInt();
            if (isValidMove(board, positionPick)) {
                break;
            }
        }
        System.out.println("Jestem tutaj");
        placeMove(board, positionPick, 'X');
        printBoard(board);
    }





    public static void placeMove(char[][] board, int position, char symbol) {
        switch (position) {
            case 1 -> board[0][0] = symbol;
            case 2 -> board[0][1] = symbol;
            case 3 -> board[0][2] = symbol;
            case 4 -> board[1][0] = symbol;
            case 5 -> board[1][1] = symbol;
            case 6 -> board[1][2] = symbol;
            case 7 -> board[2][0] = symbol;
            case 8 -> board[2][1] = symbol;
            case 9 -> board[2][2] = symbol;
            default -> System.out.println("Error");
        }
    }


    // IS VALID MOVE METHOD
    public static boolean isValidMove(char[][] board, int position) {

        switch (position) {
            case 1:
                return (board[0][0] == ' ');
            case 2:
                return (board[0][1] == ' ');
            case 3:
                return (board[0][2] == ' ');
            case 4:
                return (board[1][0] == ' ');
            case 5:
                return (board[1][1] == ' ');
            case 6:
                return (board[1][2] == ' ');
            case 7:
                return (board[2][0] == ' ');
            case 8:
                return (board[2][1] == ' ');
            case 9:
                return (board[2][2] == ' ');
        }


        System.out.println("Error");
        return false;

    }


    //PRINTING THE BOARD
    public static void printBoard(char[][] board) {

        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);

    }


}
