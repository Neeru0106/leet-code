class Solution {
    public boolean isTrionic(int[] nums) {
        int k = 0;
        int n = nums.length;
        for (k = 0; k < n - 1; k++) {
            if (nums[k] >= nums[k + 1]) {
                break;
            }
        }
        int j = k;
        for (j = k; j < n - 1; j++) {
            if (nums[j] <= nums[j + 1])
                break;
        }
        int q = j;
        for (q = j; q < n - 1; q++) {
            if (nums[q] >= nums[q + 1]) {
                break;
            }
        }
        return q == n - 1 && k > 0 && k < n - 1 && j > 0 && j < n - 1;
    }
}