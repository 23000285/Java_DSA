package Duplicate;

public class List_of_not_own_duplicates {
    public static void main(String[] args){
        int nums[] = {4, 5, 9, 10, 5, 9, 5};
        boolean flag = false;

        for (int i = 0; i < nums.length; i++) {
            boolean isDuplicateAlreadyPrinted = false;

            // Check if this number was already checked before
            for (int k = 0; k < i; k++) {
                if (nums[i] == nums[k]) {
                    isDuplicateAlreadyPrinted = true;
                    break;
                }
            }

            if (isDuplicateAlreadyPrinted)
                continue;

            // Count duplicates
            int count = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > 0) {
                System.out.println(nums[i] + " Duplicate Element");
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
