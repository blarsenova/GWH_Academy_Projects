package MyOwnTasks;

public class JumpInArray {

    public boolean canJump(int[] nums) {

        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return maxReach >= nums.length - 1;
    }

    public static void main(String[] args) {
        JumpInArray solution = new JumpInArray();

        // Example 1
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println(solution.canJump(nums1)); // Output: true

        // Example 2
        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println(solution.canJump(nums2)); // Output: false
    }

}
