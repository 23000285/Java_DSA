package Parenthesis;

import java.util.ArrayList;
import java.util.List;


public class GenerateParenthesesRecursive {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        // Base case: if the current string is complete
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // Add '(' if we still have some left to use
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        // Add ')' if it won't break the validity
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> combinations = generateParenthesis(n);
        System.out.println(combinations);
    }
}