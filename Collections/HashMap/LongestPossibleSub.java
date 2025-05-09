package Collections.HashMap;

import java.util.*;

public class LongestPossibleSub {
    public static void main(String[] args) {
        String input = "pwwkew";

        int max = 0;
        int left = 0;

        // wrapper classess
        // int -> Integer
        // char -> Character
        HashMap<Character, Integer> pos = new HashMap<>();

        for (int right = 0; right < input.length(); right++) {
            char cur = input.charAt(right);
            if (!pos.containsKey(cur)) {
                pos.put(cur, right);
                
            }

            else {
                left=Math.max(left,pos.get(cur)+1);
                pos.put(cur,right);
                
            }

            max=Math.max(max,(right-left)+1);
            System.out.println(max);
        }
        System.out.println(max);
    }

}
