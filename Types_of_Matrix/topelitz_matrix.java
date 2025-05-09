package Types_of_Matrix;

public class topelitz_matrix {
    public static void main(String[] args) {
        
        int matrix1[][]={{1,2,3,4},
                         {5,1,2,3},
                         {6,4,1,2},
                         {7,6,5,1}};

        int rows=matrix1.length;
        int cols=matrix1[0].length;

        //Top-left means down-right checking
        //Bottom-right means up-left checking

        boolean flag=true;

        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix1[i][j]!=matrix1[i-1][j-1]){
                    flag=false;
                    break;
                }
            }
        }

        if(flag){
            System.out.println("It is Topelitz Matrix");
        }

        else{
            System.out.println("It is not a Topelitz matrix");
        }
    }
}
