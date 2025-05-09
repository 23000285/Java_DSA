package Collections;

public class Symmetrix_matrix {
    public static void main(String[] args) {
        int matrix[][] = { { 2, 3, 6 },
                { 3, 4, 5 },
                { 6, 5, 9 } };

        int row = matrix.length;
        int col = matrix[0].length;

        int tr[][] = new int[row][col];

        // Transpose of the Matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tr[i][j] = matrix[j][i];
            }
        }
        System.out.println("The Normal matrix\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\nThe Tranpose of the Matrix\n");
        // Print the transponse of the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(tr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nComparing the matrix values\n");
        boolean flag = true;
        // Check whether the matrix is Symmetrix or not
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " " + tr[i][j] + " ");
                if (matrix[i][j] != tr[i][j]) {
                    flag = false;
                    break;
                }
            }
        }
        System.out.println("\n");
        if (flag)

        {
            System.out.println("It is symmetrix matrix");
        }

        else {
            System.out.println("It is not a symmetrix matrix");
        }
    }
}
