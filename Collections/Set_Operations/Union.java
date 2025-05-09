package Collections.Set_Operations;
import java.util.*;
public class Union {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5}; // Sorted array
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int j = 0; // Index to track the position of the unique elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++; // Move j to the next position
                arr[j] = arr[i]; // Place the unique element at the jth position
            }
        }
        int newLength = j + 1; // Length of the array with duplicates removed

        System.out.println(Arrays.toString(arr));
        // Print the array with duplicates removed
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

 // Print a newline for better formatting
