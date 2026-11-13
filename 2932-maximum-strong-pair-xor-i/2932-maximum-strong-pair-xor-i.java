class Solution {
	public int maximumStrongPairXor(int[] nums) {
		int result = Integer.MIN_VALUE;
		int n = nums.length;
		for (int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
                int xor = nums[i] ^ nums[j];
				if (xor > result && Math.abs(nums[i]-nums[j]) <= Math.min(nums[i], nums[j])) {
					result = xor;
				}
			}
		}
		return result;
	}
}