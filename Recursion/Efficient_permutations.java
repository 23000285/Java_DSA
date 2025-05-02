package Recursion;

import java.util.*;

// Here we are going to use the approach of DEPTH FIRST SEARCH 
// Use only the non-primitive datatype to avoid of multiple copies Instead of single copies
public class Efficient_permutations {

    public static void permutations(String str, String perm, ArrayList<String> result) {
        if (str.isEmpty()) {
            result.add(perm);
        }

        for (int i = 0; i < str.length(); i++) {
            String curr = "" + str.charAt(i); // b in a'b'c

            // removing b from a'b'c
            String remain_str = str.substring(0, i) + str.substring(i + 1); // The length is take default at the end index

            permutations(remain_str, perm + curr, result);
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        ArrayList<String> result = new ArrayList<>();
        permutations(input, "", result);
        System.out.println("Perms are \n" + result);
        ;
    }
}
