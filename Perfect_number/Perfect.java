package Perfect_number;

public class Perfect {
    public static void main(String[] args){
      int sum=0;
      int n=6;

      for(int i=1;i<n;i++){
         if(n%i==0){
            sum+=i;
         }
      }
      
      if(sum==n){
         System.out.println("It is Perfect number.");
      }
      else{
         System.out.println("It is not a Perfect number");
      }
    }
}
