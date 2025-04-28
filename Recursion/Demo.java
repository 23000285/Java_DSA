package Recursion;

public class Demo {
    public static void iterate(int n) {
        if(n<=100){
            System.out.println(n);
            iterate(n+1);
        }
    }

    public static void main(String[] args) {
        iterate(1);
    }
}