package Exception;

public class Funda {
    public static void main(String[] args){
        try{
            
            int n1=25/5;

            try{
                int arr[]={1,2,3,4,5};
                int n=arr[n1];
            }

            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index Out of Bound\n");
            }

            int num=25/0;

        }

        catch(ArithmeticException e){
            System.out.println("Division by zero is not accepted "+e);
            // u
        }

        finally{
            System.out.println("\nCompleted");
        }
    }
}
