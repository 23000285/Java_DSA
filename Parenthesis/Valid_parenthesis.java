package Parenthesis;

import java.util.Stack;

public class Valid_parenthesis {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "()[]{}";     // Expected: true
        String s2 = "(]";         // Expected: false
        String s3 = "({[]})";     // Expected: true
        String s4 = "([)]";       // Expected: false

        System.out.println("s1: " + solution.isValid(s1));
        System.out.println("s2: " + solution.isValid(s2));
        System.out.println("s3: " + solution.isValid(s3));
        System.out.println("s4: " + solution.isValid(s4));
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
