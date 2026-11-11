package array.com;
import java.util.*;

public class Exercise1 {

    public static void displayBoard(String[][] board) {
        System.out.println("------------");
        for (int i = 0; i < board.length; i++) {
            for (int x = 0; x < board[i].length; x++) {
                if (board[i][x] != null) {
                    System.out.print(" " + board[i][x] + " |");
                } else {
                    System.out.print("   |");
                }
            }
            System.out.println();
            System.out.println("------------");
        }
    }

    // Scans the ENTIRE board — rows, columns, both diagonals
    public static boolean checkWin(String[][] board) {
        int size = board.length; // assumes square board for diagonals

        // Rows
        for (int i = 0; i < size; i++) {
            String first = board[i][0];
            if (first == null) continue;
            boolean allSame = true;
            for (int x = 1; x < board[i].length; x++) {
                if (!first.equals(board[i][x])) { allSame = false; break; }
            }
            if (allSame) return true;
        }

        // Columns
        for (int x = 0; x < board[0].length; x++) {
            String first = board[0][x];
            if (first == null) continue;
            boolean allSame = true;
            for (int i = 1; i < size; i++) {
                if (!first.equals(board[i][x])) { allSame = false; break; }
            }
            if (allSame) return true;
        }

        // Main diagonal
        String firstDiag = board[0][0];
        if (firstDiag != null) {
            boolean allSame = true;
            for (int i = 1; i < size; i++) {
                if (!firstDiag.equals(board[i][i])) { allSame = false; break; }
            }
            if (allSame) return true;
        }

        // Anti-diagonal
        String firstAnti = board[0][size - 1];
        if (firstAnti != null) {
            boolean allSame = true;
            for (int i = 1; i < size; i++) {
                if (!firstAnti.equals(board[i][size - 1 - i])) { allSame = false; break; }
            }
            if (allSame) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] board = new String[3][3]; // square board, needed for diagonals

        int turn = 0;
        boolean gameWon = false;

        while (turn < 9 && !gameWon) {
            String mark = (turn % 2 == 0) ? "X" : "Y";

            System.out.println(mark + "'s turn. Enter row and col:");
            int row = input.nextInt();
            int col = input.nextInt();

            board[row][col] = mark;
            displayBoard(board);

            gameWon = checkWin(board); // scan the whole board after this move

            if (gameWon) {
                System.out.println(mark + " wins!");
            }

            turn++;
        }

        if (!gameWon) {
            System.out.println("No winner — board full.");
        }
    }
}