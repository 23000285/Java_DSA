package Prime;

import java.util.LinkedList;

public class Prime {
   LinkedList<Integer> list=new LinkedList<>();
   // static boolean isPrime(int var0) {
   //    if (var0 <= 1) {
   //       return false;
   //    } else {
   //       for(int var1 = 2; (double)var1 <= Math.sqrt((double)var0); ++var1) {
   //          if (var0 % var1 == 0) {
   //             return false;
   //          }
   //       }

   //       return true;
   //    }
   // }

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
      // Scanner var1 = new Scanner(System.in);
      // System.out.print("Enter a number: ");
      // int var2 = var1.nextInt();
      // System.out.println("All factors of " + var2 + ":");

      // // Brute Force Problem(To check with the check of all factors in the given number)
      // for(int var3 = 1; var3 <= var2; ++var3) {
      //    if (var2 % var3 == 0) {
      //       System.out.println(var3);
      //    }
      // }

      // if (isPrime(var2)) {
      //    System.out.println("" + var2 + " is a prime number.");
      // } else {
      //    System.out.println("" + var2 + " is not a prime number.");
      // }

      Prime obj=new Prime();
      for(int i=2;i<=100;i++){
         obj.print_all_prime(i);
      }
   }
}

