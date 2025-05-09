package Types_of_Matrix;

public class Upper_triangle {
    public static void main(String[] args) {
        boolean flag = true;
        int[][] arr = { { 1, 0, 1 },
                { 0, 3, 2 },
                { 0, 0, 5 }
        };
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i][j] != 0) {
                    flag = false;
                    break;
                }
            }
        }
        
        if (flag) {
            System.out.println("upper triangular matrix");
        } 
        else {
            System.out.println("not a upper triangular matrix");
        }
    }
}
