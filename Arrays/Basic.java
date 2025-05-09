package Arrays;

import java.util.*;

public class Basic {
    public static void main(String[] args) {

        // Fill String Array with "Hello"
        String[] defaultNames = new String[10];
        Arrays.fill(defaultNames, "Hello");
        System.out.println(Arrays.toString(defaultNames));
        System.out.println(defaultNames[9]);

        // Fill Integer Array with 1
        int[] nums = new int[5];
        Arrays.fill(nums, 1);
        System.out.println(nums[1]);

        // Check for Increasing Order
        int arr[] = { 1, 5, 2, 1, 21, 63 };
        boolean isIncreasing = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isIncreasing = false;
                break;
            }
        }
        if (!isIncreasing) {
            System.out.println("Not Increasing");
        }

        // Print Triangle Pattern with Numbers
        int arr1[][] = new int[11][11];
        int m = 1;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                arr1[i][j] = m;
                System.out.print(m + " ");
                m++;
            }
            System.out.println();
        }

        // Reverse of the Triangle Numbers
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        // Right-Aligned Triangle Pattern
        int o = 1;
        int sp = 10;
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= sp; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(o + "  ");
                o++;
            }
            sp -= 1;
            System.out.println();
        }

        // Post and Pre Increment
        int age = 24;
        System.out.println(age++);  // 24
        System.out.println(age++);  // 25
        System.out.println(++age);  // 27
        System.out.println(age);    // 27

        // Array Reference Behavior (Pass by Reference)
        String depts[] = { "AI-DS", "AI/ML", "IOT" };
        changeDept(depts);
        System.out.println("First Index in main " + depts[0]);
    }

    private static void changeDept(String[] depts) {
        depts[0] = "AI/DS";
        System.out.println("First index inside method " + depts[0]);
    }
}
