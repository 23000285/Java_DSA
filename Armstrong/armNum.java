package Armstrong;

public class armNum {
    public static void main(String[] args) {
        int num=93084,sum=0,sum_arm=0;
        int digit_arm;
        int temp=num;
        int res=num;

        // Count of Digits
        while(num>0){
            sum+=1;
            num=num/10;
        }

        // To Find Armstrong Number
        while(temp>0){
            digit_arm=temp%10;
            sum_arm+=Math.pow(digit_arm,sum);
            temp=temp/10;
        }

        
        System.out.println("Sum = "+sum);
        if(res==sum_arm){
            System.out.println("It is Armstrong Number = {"+res+"} equals to {"+sum_arm+"}");
        }
        else{
            System.out.println("It is not a Armstrong Number = {"+res+"} not equals to {"+sum_arm+"}");
        }
    }
        
}
