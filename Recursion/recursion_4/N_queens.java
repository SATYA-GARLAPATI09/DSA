
import java.util.*;

public class N_queens {

    static boolean isSafe(int row, int col, char board[][], int n) {

        // check column (upward)
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') return false;
        }

        // check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    static void solve(int row, char board[][], int n, List<List<String>> result) {

        // base case: all rows filled
        if (row == n) {
            List<String> current = new ArrayList<>();
            for (char[] r : board) {
                current.add(new String(r));
            }
            result.add(current);
            return;
        }

        // try placing queen in every column of current row
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board, n)) {

                // place
                board[row][col] = 'Q';
                solve(row + 1, board, n, result);

                // backtrack
                board[row][col] = '.';
            }
        }
    }

    public static void main(String[] args) {

        int n = 4;

        char board[][] = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');

        List<List<String>> result = new ArrayList<>();
        solve(0, board, n, result);

        System.out.println("Total solutions for " + n + "-Queens: " + result.size());
        for (List<String> sol : result) {
            for (String row : sol) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
