class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            int target=nums[i];
            for(int j=i+1;j<n;j++){
                if(Math.min(target,nums[j])>=Math.abs(target-nums[j]))
                    max=Math.max(max,target^nums[j]);
            }
        }
        return max;
    }
}