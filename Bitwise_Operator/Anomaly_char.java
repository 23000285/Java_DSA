package Bitwise_Operator;

public class Anomaly_char {
    public static void main(String[] args) {
        String t1 = "Hello";
        StringBuilder b1 = new StringBuilder();
        for (char ch : t1.toCharArray()) {
            b1.append(String.format("%8s", Integer.toBinaryString(ch)).replace(' ', '0')).append(" ");
        }

        String t2 = "Hellw";
        StringBuilder b2 = new StringBuilder();
        for (char ch : t2.toCharArray()) {
            b2.append(String.format("%8s", Integer.toBinaryString(ch)).replace(' ', '0')).append(" ");
        }

        System.out.println(b1.toString().trim());
        System.out.println(b2.toString().trim());

        // New method: Compare each character
        int len = Math.min(t1.length(), t2.length());
        char anomalyChar = 0;

        for (int i = 0; i < len; i++) {
            if (t1.charAt(i) != t2.charAt(i)) {
                anomalyChar = t2.charAt(i);
                break;
            }
        }

        if (anomalyChar == 0 && t1.length() != t2.length()) {
            anomalyChar = (t1.length() > t2.length()) ? t1.charAt(t2.length()) : t2.charAt(t1.length());
        }

        System.out.println("Anomalous character: " + anomalyChar);
    }
}
