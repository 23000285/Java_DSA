package Root_Finding;

import java.util.*;

public class Nth_root_error {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        boolean b = false;
        if (r == 3) {
            b = cube_root(n, r);
        } else if (r == 2) {
            b = square_root(n, r);
        }

        if (b == false) {
            double number = (double) n;
            double root = (double) r;

            double left = 0;
            double right = number;
            double middle = 0;
            double error = 0.01;

            multiply(number, root);

            while ((right - left) > error) {
                middle = (left + right) / 2;
                if (multiply(middle, root) > number) {
                    right = middle;
                } else {
                    left = middle;
                }
            }
            System.out.println("Middle Element: " + middle);
        }
    }

    public static double multiply(double number, double root) {
        double mulValue = 1;
        for (int i = 0; i < root; i++) {
            mulValue = mulValue * number;
        }
        return mulValue;
    }

    public static boolean square_root(int n, int root) {
        boolean flag = false;

        for (int i = 1; (i * i) <= n; i++) {
            int sq = i * i;
            if (sq == n) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("The Perfect Square");
        }
        return flag;
    }

    public static boolean cube_root(int n, int root) {
        boolean flag = false;
        for (int i = 1; (i * i * i) <= n; i++) {
            int cube = i * i * i;
            if (cube == n) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("The Perfect Cube");
        }
        return flag;
    }

}
