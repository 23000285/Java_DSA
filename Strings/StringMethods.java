package Strings;

public class StringMethods {
    public static void main(String[] args) {
        String strVariable = "Java Development";

        System.out.println(strVariable.charAt(6));

        System.out.println(strVariable.contains("lorgggg"));

        System.out.println(strVariable.equalsIgnoreCase("hello"));

        System.out.println(strVariable.indexOf("ipsum"));

        // strVariable="";
        // strVariable=null; It is showing an error
        System.out.println(strVariable.isEmpty());

        System.out.println(strVariable.length());

        System.out.println(strVariable.replace("ips", "lorem"));

        System.out.println(strVariable.substring(6));

        String substring=strVariable.substring(6);
        System.out.println(substring);

        String trimmedString=strVariable.trim();
        System.out.println(trimmedString);
    }

}
