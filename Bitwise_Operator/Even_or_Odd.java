package Bitwise_Operator;

public class Even_or_Odd {
    public static void main(String[] args) {

        // 4->0 1 0 0
        // 1->0 0 0 1 (&)
        // --------------
        //    0 0 0 0    So all are zeros, it is Even
        // --------------

        // 5->0 1 0 1
        // 1->0 0 0 1 (&)
        // --------------
        //    0 0 0 1    So some zeros and last is one, it is Odd
        // --------------


        // Even or Odd with Bitwise Opeator
        int input = 3;
        if ((input & 1) == 0) {
            System.out.println("Even");
        }

        else {
            System.out.println("Odd");
        }
    }
}

