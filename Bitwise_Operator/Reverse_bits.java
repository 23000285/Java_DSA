package Bitwise_Operator;

public class Reverse_bits {
    public static void main(String[] args) {
        int n = 10;
        int result = 0;

        for (int i = 0; i < 32; i++) {
            int bit = (n >> i) & 1;
            result |= (bit << (31 - i));
        }

        System.out.println(result);

        // Iteration 0: bit=0, shift=31, bit<<shift=0, result=0
        // Iteration 1: bit=1, shift=30, bit<<shift=1073741824, result=1073741824
        // Iteration 2: bit=0, shift=29, bit<<shift=0, result=1073741824
        // Iteration 3: bit=1, shift=28, bit<<shift=268435456, result=1342177280
        // Iteration 4: bit=0, shift=27, bit<<shift=0, result=1342177280
        // Iteration 5: bit=0, shift=26, bit<<shift=0, result=1342177280
        // Iteration 6: bit=0, shift=25, bit<<shift=0, result=1342177280
        // Iteration 7: bit=0, shift=24, bit<<shift=0, result=1342177280
        // Iteration 8: bit=0, shift=23, bit<<shift=0, result=1342177280
        // Iteration 9: bit=0, shift=22, bit<<shift=0, result=1342177280
        // Iteration 10: bit=0, shift=21, bit<<shift=0, result=1342177280
        // Iteration 11: bit=0, shift=20, bit<<shift=0, result=1342177280
        // Iteration 12: bit=0, shift=19, bit<<shift=0, result=1342177280
        // Iteration 13: bit=0, shift=18, bit<<shift=0, result=1342177280
        // Iteration 14: bit=0, shift=17, bit<<shift=0, result=1342177280
        // Iteration 15: bit=0, shift=16, bit<<shift=0, result=1342177280
        // Iteration 16: bit=0, shift=15, bit<<shift=0, result=1342177280
        // Iteration 17: bit=0, shift=14, bit<<shift=0, result=1342177280
        // Iteration 18: bit=0, shift=13, bit<<shift=0, result=1342177280
        // Iteration 19: bit=0, shift=12, bit<<shift=0, result=1342177280
        // Iteration 20: bit=0, shift=11, bit<<shift=0, result=1342177280
        // Iteration 21: bit=0, shift=10, bit<<shift=0, result=1342177280
        // Iteration 22: bit=0, shift=9, bit<<shift=0, result=1342177280
        // Iteration 23: bit=0, shift=8, bit<<shift=0, result=1342177280
        // Iteration 24: bit=0, shift=7, bit<<shift=0, result=1342177280
        // Iteration 25: bit=0, shift=6, bit<<shift=0, result=1342177280
        // Iteration 26: bit=0, shift=5, bit<<shift=0, result=1342177280
        // Iteration 27: bit=0, shift=4, bit<<shift=0, result=1342177280
        // Iteration 28: bit=0, shift=3, bit<<shift=0, result=1342177280
        // Iteration 29: bit=0, shift=2, bit<<shift=0, result=1342177280
        // Iteration 30: bit=0, shift=1, bit<<shift=0, result=1342177280
        // Iteration 31: bit=0, shift=0, bit<<shift=0, result=1342177280

    }
}
