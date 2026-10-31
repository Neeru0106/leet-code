class Solution {
    public int peakValleyDifference(int[] nums) {
        int previous=nums[0];
        int n=nums.length;
        int a=0,b=0;
        for(int i=1;i<n-1;i++){
            if(nums[i]>previous){
                if(nums[i]>nums[i+1]){
                    a+=nums[i];
                }
            } else if(nums[i]<previous){
                if(nums[i]<nums[i+1]){
                    b+=nums[i];
                }
            }
            previous=nums[i];
        }
        return a-b;
    }
}