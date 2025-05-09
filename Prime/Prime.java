package Prime;

import java.util.LinkedList;

public class Prime {
   LinkedList<Integer> list=new LinkedList<>();

   public void print_all_prime(int n) {
      

      boolean flag=true;

      for(int i=2;i<n;i++){
         if(n%i==0){
            flag=false;
         }
      }
      if(flag){
         list.add(n);
         System.out.print(n+" ");
      }
      
      if(n==97){
         System.out.println("The list of values:");
         System.out.println(list);
      }
         
   }

   public static void main(String[] var0) {


      Prime obj=new Prime();
      for(int i=2;i<=100;i++){
         obj.print_all_prime(i);
      }
   }
}

