class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq=new int[101];
        int n=nums.length;
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        int[] lowsum=new int[102];
        for(int i=0;i<=100;i++){
            lowsum[i+1]=lowsum[i]+freq[i];
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=lowsum[nums[i]];
        }
        return ans;
    }
}