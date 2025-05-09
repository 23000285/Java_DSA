package Types_of_Matrix;

public class Diagonal_matrix {
    public static void main(String[] args) {
        int matrix[][] = { { 3, 0, 0, 0, 0 },
                { 0, 3, 0, 0, 0 },
                { 0, 0, 1, 0, 0 },
                { 0, 0, 0, 4, 0 },
                { 0, 0, 0, 0, 5} };


        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length != matrix[i].length) {
                System.out.println("It is not a Square matrix to find the diagonal matrix");
                return;
            }
        }


        int diagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    diagonal++;
                    continue;
                }
            }
        }

        System.out.println("The availability of diagonal = "+diagonal);

        if (diagonal == matrix.length) {
            System.out.println("It is diagonal matrix");
        } else {
            System.out.println("It is not a diagonal matrix");
        }

    }
}