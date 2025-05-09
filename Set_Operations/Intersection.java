package Set_Operations;

import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 5, 4, 1};
        int arr2[] = {3, 4, 1, 2, 3, 6, 7};

        boolean[] visited = new boolean[arr2.length];
        int[] result = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && !visited[j]) {
                    result[index++] = arr1[i];
                    visited[j] = true;
                    break;
                }
            }
        }

        // Print only the filled part of the result array
        int[] intersection = Arrays.copyOf(result, index);
        System.out.println("Intersection: " + Arrays.toString(intersection));
    }
}
