package Recursion;

public class Natural {
    public static int display(int n){
        if(n==0){
            return 0;
        }
        return n+display(n-1);
    }
    
    public static void main(String[] args) {
        System.out.println(display(5));
    }
}

