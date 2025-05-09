package Strings;

public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // Append text
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert text at position 5
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // Replace from index 6 to 10
        sb.replace(6, 10, "Python");
        System.out.println("After replace: " + sb);

        // Delete characters from index 6 to 12
        sb.delete(6, 12);
        System.out.println("After delete: " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

    }
}
