package Bitwise_Operator;

public class Solution {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        String b1 = Integer.toBinaryString(x);
        String b2 = Integer.toBinaryString(y);

        // Pad the shorter string with leading 0s
        int maxLength = Math.max(b1.length(), b2.length());
        b1 = String.format("%" + maxLength + "s", b1).replace(' ', '0');
        b2 = String.format("%" + maxLength + "s", b2).replace(' ', '0');

        int count = 0;
        for (int i = 0; i < maxLength; i++) {
            if (b1.charAt(i) != b2.charAt(i)) {
                count++;
            }
        }

        System.out.printf("The Binary value of x is %s\n", b1);

        System.out.printf("The Binary value of y is %s\n", b2);

        System.out.println("The count of two Unequal Bits is " + count);
    }
}
