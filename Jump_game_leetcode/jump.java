package Jump_game_leetcode;

public class jump {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {2, 3, 1, 1, 4};  // Expected: true
        int[] nums2 = {3, 2, 1, 0, 4};  // Expected: false

        System.out.println("Can jump (nums1): " + solution.canJump(nums1));
        System.out.println("Can jump (nums2): " + solution.canJump(nums2));
    }
}

class Solution {
    public boolean canJump(int[] nums) {
        int i = 0;
        int reachable = 0;

        while (i <= reachable) {
            int jump = i + nums[i];
            if (jump > reachable) {
                reachable = jump;
            }
            if (reachable >= nums.length - 1) {
                return true;
            }
            i++;
        }

        return false;
    }
}
