package Recursion;

public class Demo {
    public static void iterate(int n) {
        if (n < 1) {
            return;
        }
        System.out.println("Welcome to Saveetha");
        iterate(n - 1);
    }

    public static void main(String[] args) {
        iterate(5);
    }
}