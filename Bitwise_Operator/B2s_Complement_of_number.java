package Bitwise_Operator;

public class B2s_Complement_of_number {
    public static void main(String[] args) {
        int n=-9;
        // Convert into positive sign
        // 9->1 0 0 1
        // complement of 9
        // 6->0 1 1 0
        // add 1 on the least significant bit
        // 7->0 1 1 1

        // 5 ->  1 0 1
        // 10->1 0 1 0

        int numberOfBits = Integer.toBinaryString(n).length();
        int mask = (1 << numberOfBits) - 1; // Mask with all bits set to 1
        int onesComplement = ~n & mask;
        System.out.println(onesComplement|1);
        
        int n1=-22;
        // Convert into positive sign
        // 22-> 1 0 1 1 0
        // complement of 22
        // 9 -> 0 1 0 0 1
        // add 1 on the least significant bit
        // 11-> 0 1 0 1 0
    }
}
