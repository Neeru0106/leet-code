class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int[] prefixsum=new int[n];
        prefixsum[0]=nums[0];
        for(int i=1;i<n;i++){
            prefixsum[i]=prefixsum[i-1]+nums[i];
        }
        int sum=prefixsum[n-1];
        int suffix=0;
        int count=0;
        int prefix=0;
        for(int i=n-1;i>0;i--){
            suffix+=nums[i];
            prefix=prefixsum[i]-nums[i];
            if((prefix-suffix)%2==0){
                count++;
            }
        }
        return count;
    }
}