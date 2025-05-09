package Numbers;

import java.util.Scanner;

public class Numbers_to_words_IndianSystem {

    static String[] ones = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
        "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
        "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    static String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty",
        "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String convertToWords(int num) {
        if (num == 0) return "Zero";

        String result = "";

        if (num >= 10000000) { // Crores
            result += convertToWords(num / 10000000) + " Crore ";
            num %= 10000000;
        }
        if (num >= 100000) { // Lakhs
            result += convertToWords(num / 100000) + " Lakh ";
            num %= 100000;
        }
        if (num >= 1000) { // Thousands
            result += convertToWords(num / 1000) + " Thousand ";
            num %= 1000;
        }
        if (num >= 100) { // Hundreds
            result += convertToWords(num / 100) + " Hundred ";
            num %= 100;
            if (num > 0) result += "and ";
        }

        if (num > 0) {
            if (num < 20) {
                result += ones[num];
            } else {
                result += tens[num / 10];
                if (num % 10 > 0) {
                    result += " " + ones[num % 10];
                }
            }
        }

        return result.trim();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter a number (0 to 99,99,99,999) or -1 to exit: ");
                int num = sc.nextInt();
                
                if (num == -1) {
                    System.out.println("Exiting...");
                    break;
                }
                
                if (num < 0 || num > 999999999) {
                    System.out.println("Number out of supported range.");
                } else {
                    String word = convertToWords(num);
                    System.out.println("In words (Indian format): " + word);
                }
                
                System.out.println();
            }
        }
    }
}
