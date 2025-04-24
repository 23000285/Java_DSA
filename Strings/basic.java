package Strings;

public class basic {
    public static void main(String[] args) {
        String name = "Ramesh";

        String employee = "Ramesh";

        System.out.println(name == employee);

        // This will modify the address of variable that update the address
        // from the name variable
        String tenant = new String("Ramesh");

        // The below it check for the address equals or not in that
        System.out.println("Shallow " + (name == tenant));

        // The below it is check if the value is equals or not in that
        System.out.println("Deep " + name.equals(tenant));
    }
}
