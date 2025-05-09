package Types_of_Matrix;

public class Merging_two_sorted_array {
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 13, 42};
        int arr1[] = {3, 5, 7, 24, 63};

        int len = arr.length + arr1.length;
        int result[] = new int[len];

        int i = 0, j = 0, k = 0;

        while (i < arr.length && j < arr1.length) {
            if (arr[i] < arr1[j]) {
                result[k++] = arr[i++];
            } else {
                result[k++] = arr1[j++];
            }
        }
        
        while (i < arr.length) {
            result[k++] = arr[i++];
        }
        
        while (j < arr1.length) {
            result[k++] = arr1[j++];
        }

        for (int x = 0; x < len; x++) {
            System.out.print(result[x] + " ");
        }
    }
}
