package Bitwise_Operator;

public class Counts_of_Binary {
    public static void main(String[] args) {
        int decimal = 20;
        int count = 0;
        String binary = Integer.toBinaryString(decimal);
        int temp=decimal;
        while (decimal > 0) {
            if ((decimal & 1) == 1) {
                count++;
            }
            decimal = decimal >> 1; // Right shift by 1
        }
        
        System.out.println("Number of 1s in binary: " + count);
        System.out.printf("The Binary value %d is %s",temp,binary);
    }
}
