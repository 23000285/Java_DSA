package Without_Arithmetic;


public class Division {
    public static void main(String[] args){
        Division obj=new Division();
        System.out.println(obj.divide(15,5));

    }

    public int divide(int dividend, int divisor) {
        if (divisor == 0) return Integer.MAX_VALUE; 
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE; 
        
        boolean negative = (dividend < 0) ^ (divisor < 0); 
        
        long dividendL = Math.abs((long) dividend);
        long divisorL = Math.abs((long) divisor);
        
        int quotient = 0;
        
        while (dividendL >= divisorL) {
            long tempDivisor = divisorL, multiple = 1;
            while (dividendL >= (tempDivisor + tempDivisor)) {
                tempDivisor += tempDivisor;
                multiple += multiple;
            }
            dividendL -= tempDivisor;
            quotient += multiple;
        }
        
        return negative ? -quotient : quotient;
    }
}