package Recursion;

public class Fibonacci {

    public static int fibonacci1(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci1(n - 1) + fibonacci1(n - 2);
    }

    public static void main(String[] args) {
        int result = fibonacci1(10);
        System.out.println(result); 
    }
}
