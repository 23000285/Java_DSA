package Without_Arithmetic;

public class Multiplication {
    public static void main(String[] args) {
        int a = 15, b = 3;
        int result = 0;

        while (b > 0) {
            if ((b & 1) == 1) {
                result += a;
            }
            a <<= 1;
            b >>= 1;
        }
        
        System.out.println("Multiplication result = " + result);
    }
}
