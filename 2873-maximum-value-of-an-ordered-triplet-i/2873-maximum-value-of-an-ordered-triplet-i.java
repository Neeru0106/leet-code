class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long max = 0;

        int[] left = new int[n];
        left[0] = 0;
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], nums[i - 1]);
        }

        int[] right = new int[n];
        right[n - 1] = 0;
        for (int j = n - 2; j >= 0; j--) {
            right[j] = Math.max(right[j + 1], nums[j + 1]);
        }

        for (int k = 1; k < n - 1; k++) {
            long cur = (long) (left[k] - nums[k]) * right[k];
            max = Math.max(max, cur);
        }

        return max;
    }
}