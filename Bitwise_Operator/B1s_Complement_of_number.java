package Bitwise_Operator;

public class B1s_Complement_of_number {
    public static void main(String[] args) {
        int n = 5;
        int numberOfBits = Integer.toBinaryString(n).length();
        int mask = (1 << numberOfBits) - 1; // Mask with all bits set to 1
        int onesComplement = ~n & mask;
        System.out.println(onesComplement);
    }
}
