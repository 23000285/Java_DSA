package Duplicate;

public class List_of_duplicate_values {
    public static void main(String[] args) {
        int nums[] = {4, 5, 9, 10, 5, 9, 5};
        boolean flag = false;

        boolean visit[] = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (visit[i]) continue;
            int count = 0;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    visit[j] = true;
                    count++;
                }
            }

            if (count > 0) {
                for (int k = 0; k < count; k++) {
                    System.out.println(nums[i] + " Duplicate Element");
                }
                flag = true;
            }
        }

        if (flag) {
            System.out.println("Duplicate Elements Present");
        } else {
            System.out.println("Duplicate Element is not Present");
        }
    }
}
