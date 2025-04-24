package Strings;

public class String_builder {
    public static void main(String[] args) {
        
        long start = System.nanoTime();
        StringBuilder build = new StringBuilder("Numbers are: ");
        for (int i = 0; i < 100000; i++) {
            build.append(" " + i);
        }
        long end = System.nanoTime();
        System.out.println("Builder time = " + (end - start));



        long startS = System.nanoTime();
        String stringS = new String("Numbers are: ");
        for (int i = 0; i < 100000; i++) {
            stringS += " " + i;
        }
        long endS = System.nanoTime();
        System.out.println("Builder time = " + (endS - startS));

        // System.out.println(build.capacity());

        StringBuilder builder=new StringBuilder("cargo van");

        builder.toString();

        System.out.println(builder);
    }
}
