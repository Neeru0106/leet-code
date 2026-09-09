class Solution {
    public int maximumDifference(int[] nums) {
        int max=0;
        int n=nums.length;
        int diff=0;
        int[] nextMax=new int[n];
        for(int i=n-2;i>=0;i--){
            if(nums[i+1]>max){
                max=nums[i+1];
            }
            nextMax[i]=max;
        }
        for(int i=0;i<n-1;i++){
            if(nextMax[i]-nums[i]>diff){
                diff=nextMax[i]-nums[i];
            }
        }
        if(diff==0){
            return -1;
        }
        return diff;
    }
}