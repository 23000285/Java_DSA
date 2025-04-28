package Recursion;

public class list_sum {
    public static int addition(int l[],int i){
        if(i==0){
            return l[0];
        }

        return l[i]+addition(l,i-1);
    }
    public static void main(String[] args) {
        int list[]={4,7,8,3,3};

        System.out.println(addition(list,list.length-1));
    }
}
