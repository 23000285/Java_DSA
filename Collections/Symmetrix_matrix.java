package Collections;



public class Symmetrix_matrix {
    public static void main(String[] args) {
        int matrix[][]={{2,3,6},
                        {3,4,5},
                        {6,5,9}};

        int row=matrix.length;
        int col=matrix[0].length;

        int result[][]=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                result[i][j]=matrix[j][i];
            }
        }

        //Transpose of the Matrix
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

        //Check whether the matrix is Symmetrix or not
        
    }
}
