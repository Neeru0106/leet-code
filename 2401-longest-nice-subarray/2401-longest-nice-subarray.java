class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left = 0;
        int currentMask = 0;
        int maxLen = 0;
        for (int right = 0; right < nums.length; right++) {
            while ((currentMask & nums[right]) != 0) {
                currentMask ^= nums[left];
                left++;
            }
            currentMask |= nums[right];
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}