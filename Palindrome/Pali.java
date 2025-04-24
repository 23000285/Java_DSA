package Palindrome;

// This is the efficient Code with the Time complexity of o(log N)
public class Pali {
    public static void main(String[] args){
        int num=123321;
        int digit,reverse=0;
        while(num>reverse){
            digit=num%10;
            reverse=reverse*10+digit;
            num/=10;
        }
        if(num==reverse||num==reverse/10){
            System.out.print("palindrome");
        }
        else{
            System.out.print("not a palindrome");
        }
        
    }
}
