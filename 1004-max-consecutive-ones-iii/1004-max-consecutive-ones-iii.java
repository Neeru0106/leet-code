class Solution {
    public int longestOnes(int[] nums, int k) {
        int count=0;
        int maxlen=0;
        int windowstart=0;
        int n=nums.length;
        for(int windowend=0;windowend<n;windowend++){
            if(nums[windowend]==0){
                count++;
            }
            while(count>k){
                if(nums[windowstart]==0){
                    count--;
                }
                windowstart++;
            }
            maxlen=Math.max(maxlen,windowend-windowstart+1);
        }
        return maxlen;
    }
}