// package Numbers;

// import java.util.Scanner;

// public class Numbers_to_words {

//     public static void main(String[] args) {
//         String[] num2words1 = {
//                 "", "One", "Two", "Three", "Four", "Five",
//                 "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
//                 "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
//                 "Eighteen", "Nineteen"
//         };

//         String[] num2words2 = {
//                 "", "", "Twenty", "Thirty", "Forty", "Fifty",
//                 "Sixty", "Seventy", "Eighty", "Ninety"
//         };

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Please enter a number between 0 and 999: ");
//         int num = sc.nextInt();
//         String result = "";

//         if (num == 0) {
//             result = "Zero";
//         } else if (num >= 1 && num <= 19) {
//             result = num2words1[num];
//         } else if (num >= 20 && num <= 99) { //51
//             int tens = num / 10;//5
//             int ones = num % 10;//1
//             result = num2words2[tens]; //fifty
//             if (ones > 0) {
//                 result += " " + num2words1[ones];//one
//             }
//         } else if (num >= 100 && num <= 999) { //450
//             int hundreds = num / 100; //4
//             int remainder = num % 100; //50
//             result = num2words1[hundreds] + " Hundred"; //Four Hundred

//             if (remainder > 0) {
//                 result += " and ";
//                 if (remainder <= 19) {
//                     result += num2words1[remainder];
//                 } else {
//                     int tens = remainder / 10; //5
//                     int ones = remainder % 10; //0
//                     result += num2words2[tens]; //Four Hundred and Fifty
//                     if (ones > 0) {
//                         result += " " + num2words1[ones]; 
//                     }
//                 }
//             }
//         }

                

//         else {
//             result = "Number Out Of Range";
//         }

//         System.out.println("Converted to word it becomes: " + result);
//     }

// }

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
