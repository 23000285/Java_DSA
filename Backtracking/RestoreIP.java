package Backtracking;

import java.util.*;

public class RestoreIP {

    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        int n = s.length();

        // We need at least 4 digits and at most 12
        if (n < 4 || n > 12) return result;

        for (int i = 1; i < Math.min(4, n - 2); i++) {
            for (int j = i + 1; j < Math.min(i + 4, n - 1); j++) {
                for (int k = j + 1; k < Math.min(j + 4, n); k++) {

                    String part1 = s.substring(0, i);
                    String part2 = s.substring(i, j);
                    String part3 = s.substring(j, k);
                    String part4 = s.substring(k);

                    if (isValid(part1) && isValid(part2) &&
                        isValid(part3) && isValid(part4)) {

                        result.add(part1 + "." + part2 + "." + part3 + "." + part4);
                    }
                }
            }
        }

        return result;
    }

    // Check if the segment is valid
    private boolean isValid(String part) {
        if (part.length() == 0 || part.length() > 3) return false;
        if (part.charAt(0) == '0' && part.length() > 1) return false;
        int val = Integer.parseInt(part);
        return val >= 0 && val <= 255;
    }

    public static void main(String[] args) {
        RestoreIP ipSolver = new RestoreIP();
        String input = "101023";
        List<String> ips = ipSolver.restoreIpAddresses(input);
        for (String ip : ips) {
            System.out.println(ip);
        }
    }
}
