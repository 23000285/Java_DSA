package Backtracking;

public class N_queen {
    public static void main(String[] args) {
        int n = 4;

        // if n<4 no solution
        int[] queens = new int[n];
        int row = 0;
        placeMyQueens(queens, row);
    }

    private static void placeMyQueens(int[] queens, int row) {
        if (row >= queens.length) {
            System.out.println("*");
            for (int i = 0; i < queens.length; i++) {
                System.out.println("[ " + i + " ,  " + queens[i] + "]");
            }
            return;
        }

        for (int col = 0; col < queens.length; col++) {
            if (isSafe(queens, row, col)) {
                queens[row] = col; // placing our queen
                placeMyQueens(queens, row + 1);
            }
        }
    }

    private static boolean isSafe(int[] queens, int row, int col) {
        for (int i = 0; i < row; i++) {
            // checking for same columns
            if (queens[i] == col) {
                return false;
            }
            // checcking for the left to bottom right diagonal
            if (i - row == queens[i] - col) {
                return false;
            }
            // checking for top right to bottom left
            if (i - row == col - queens[i]) {
                return false;
            }

        }
        return true;
    }
}