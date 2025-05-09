package Arrays;

import java.util.*;

public class Normal_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Add the elemnts
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display the elements in the arrya
        System.out.println("The array elements is ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        // Remove the element
        int result[] = new int[n - 1];
        int index = 0;
        int toRemove = 3;

        for (int i = 0; i < n; i++) {
            if (arr[i] != toRemove) {
                result[index++] = arr[i];
            }
        }

        // Get the specific element
        int target = 2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("The index of " + target + " is " + index);

        // Get the size of the element
        System.out.println("The size of the array is " + arr.length);

        // Rotate the element in the array
        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;

        for (int val : arr) {
            System.out.print(val + " "); 
        }

        System.out.println();
        // Shift left by 1
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = -1; // fill last if needed

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
