class Solution {
    public int longestSubarray(int[] nums) {
        int windowstart=0;
        int max=0;
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count++;
            }
            while(count>1){
                if(nums[windowstart]==0){
                    count--;
                }
                windowstart++;
            }
            max=Math.max(max,i-windowstart);
        }
        return max;
    }
}