package Bitwise_Operator;

public class FindExtraCharacter_2 {
    public static void main(String[] args) {
        String str1="hello";
        String str2="helllo";

        char result=0;

        String concat=str1+str2;

        char[] chars=concat.toCharArray();

        for(int i=0;i<chars.length;i++){
            result=(char)(result^chars[i]);

        }
        System.out.println("Odd one out is : "+result);
    }
}
