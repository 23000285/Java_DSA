package FACTORIAL;

import java.util.Scanner;

public class TrailingZerosInFactorial {
    public static int countTrailingZeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int zeros = countTrailingZeros(n);
        System.out.println("Number of trailing zeros in " + n + "! is: " + zeros);
    }
}

