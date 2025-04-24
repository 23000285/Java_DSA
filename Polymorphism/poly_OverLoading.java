package Polymorphism;

public class poly_OverLoading {
    public static void main(String[] args) {
        int n1=10;
        int n2=20;

        calculate(n1,n2);

        double a=10.55;
        double b=11.15;

        calculate(a,b);

        calculate(n1);

        int c=4;
        int d=3;
        
        String output=""+calculate(c,d);
        System.out.println(output);
    }

    // static void calculate(int a,int b){
    //     System.out.println(a+b);
    // }

    static void calculate(double a,double b){
        System.out.println(a+b);
    }

    static void calculate(int a){
        System.out.println(a*a);
    }

    static String calculate(int a,int b){
        int result=a*b;
        return "I/O is "+result;
    }
}
