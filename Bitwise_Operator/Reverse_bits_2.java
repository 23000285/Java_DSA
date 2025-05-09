package Bitwise_Operator;

public class Reverse_bits_2 {
    public static void main(String[] args) {
        int n = 10;
        int result = 0;

        for (int i = 0; i < 32; i++) {
        int bit = (n >> i) & 1;
        result |= (bit << (31 - i));
        }

        System.out.println(result);



        int num = 10;
        int output = 0;

        for (int i = 0; i < 32; i++) {
            int last = num & 1; // Step 1: Get the last bit of `num`

            if (output != 0) {
                output = output << 1; // Step 2: Shift `output` left by 1
            }

            if (last == 1) {
                output = output | 1; // Step 3: Set the last bit of `output` to 1
            }

            num = num >> 1; // Step 4: Shift `num` right by 1 to process the next bit
        }

        System.out.println(output); // Step 5: Print the final result (reversed bits of `num`)

    }
}
