public class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // 1. Move each number to its correct index if possible
        // e.g., the number 1 should be at index 0, 2 at index 1, etc.
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with the element at its target index
                int targetIndex = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[targetIndex];
                nums[targetIndex] = temp;
            }
        }

        // 2. Find the first index where the number doesn't match the index + 1
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // 3. If all numbers from 1 to n are present, the answer is n + 1
        return n + 1;
    }
}