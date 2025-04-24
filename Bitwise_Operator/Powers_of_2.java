package Bitwise_Operator;

public class Powers_of_2 {
    public static void main(String[] args) {

        // To check where given value is power of 2 or not
        int n=27;
        
        if ((n & n-1) == 0) {
            System.out.println(n);
        } else {
            System.out.println("Not power of 2");
        }

        // // To Make the power rise to it
        // for (int i = 0; i < 10; i++) {
        //     System.out.println(1 << i);  // 2^i
        // }

    }
}
