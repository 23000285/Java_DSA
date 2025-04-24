package Bitwise_Operator;

public class Types_of_Bitwise {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        // And Operator
        System.out.printf("3 and 5: %d%n", a & b);

        // Or Operator
        System.out.printf("3 or 5: %d%n", a | b);

        // Not operator
        System.out.println("5 no is " + (~b));

        // Right Shift
        System.out.println(7>>1);

        // Left Shift
        System.out.println(7<<1);
    }
}
