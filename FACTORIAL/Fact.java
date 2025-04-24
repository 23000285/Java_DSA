package FACTORIAL;

import java.math.BigInteger;

public class Fact {

    BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }
    
    public static void main(String[] args) {
        Fact obj = new Fact();
        BigInteger input = BigInteger.valueOf(24);
        System.out.println(obj.factorial(input));
    }
}
