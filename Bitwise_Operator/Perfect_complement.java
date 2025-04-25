package Bitwise_Operator;

import java.util.*;

public class Perfect_complement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String binary = Integer.toBinaryString(decimal);
        String complement = "";

        for (int i = 0; i < binary.length(); i++) {
            char bit = binary.charAt(i);
            if (bit == '0') {
                complement += '1';
            } else if (bit == '1') {
                complement += '0';
            }
        }

        int complementDecimal = Integer.parseInt(complement, 2);

        System.out.println("Original Binary: " + binary);
        System.out.println("1's Complement: " + complement);
        System.out.println("Complement in Decimal: " + complementDecimal);

        }
}
