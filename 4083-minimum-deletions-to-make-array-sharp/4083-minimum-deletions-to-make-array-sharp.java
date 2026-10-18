class Solution {
    public int minDeletions(int[] nums) {
        if(nums == null || nums.length <=1){
            return 0;
        }
        int count=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if((nums[i]^nums[i-1])==0){
                count++;
            }
        }
        return count;
    }
}