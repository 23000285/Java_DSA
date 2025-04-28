package Recursion;

public class GCD {
    public static int display(int a, int b) {
        if (b != 0) {
            return display(b, a % b);
        }

        else {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(display(15, 21));
    }
}
