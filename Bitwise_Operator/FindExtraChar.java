package Bitwise_Operator;

public class FindExtraChar {
    
    public static char findExtraChar(String s1, String s2) {
        int xorSum = 0;
        
        for (char c : s1.toCharArray()) {
            xorSum ^= (int) c;
        }
        
        for (char c : s2.toCharArray()) {
            xorSum ^= (int) c;
        }
        
        return (char) xorSum;
    }
    
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hellow";
        char extraChar = findExtraChar(s1, s2);
        System.out.println("The extra character is: " + extraChar);

        // String str1="hello";
        // String str2="helllo";

        // char result=0;

        // String concat=str1+str2;

        // char[] chars=concat.toCharArray();

        // for(int i=0;i<chars.length;i++){
        //     result=(char)(result^chars[i]);

        // }
        // System.out.println("Odd one out is - "+result);
    }

}
