package Recursion;

// permute("ABC", "")
// ├── permute("BC", "A")
// │   ├── permute("C", "AB") → "ABC"
// │   └── permute("B", "AC") → "ACB"
// ├── permute("AC", "B")
// │   ├── permute("C", "BA") → "BAC"
// │   └── permute("A", "BC") → "BCA"
// └── permute("AB", "C")
//     ├── permute("B", "CA") → "CAB"
//     └── permute("A", "CB") → "CBA"

public class Permutations {
    static void permute(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            permute(left + right, result + ch);
        }
    }

    public static void main(String[] args) {
        String input = "ABC";
        permute(input, "");
    }
}

