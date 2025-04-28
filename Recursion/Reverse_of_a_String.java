package Recursion;

public class Reverse_of_a_String {

    public static String reverse(String str, int i) {
        if (i == 0) {
            return String.valueOf(str.charAt(0));
        }
        return str.charAt(i) + reverse(str, i - 1);
    }

    public static void main(String[] args) {
        String str = "noisrucer";
        System.out.println(reverse(str, str.length() - 1));
    }
}