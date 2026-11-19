class Solution {
    public int Max_Digit(int n){
        int min=0;
        while(n!=0){
            int rem=n%10;
            if(rem>min){
                min=rem;
            }
            n/=10;
        }
        return min;
    }
    public int maxSum(int[] nums) {
        int n=nums.length;
        int maxsum=-1;
        int[] max=new int[n];
        for(int i=0;i<n;i++){
            max[i]=Max_Digit(nums[i]);
        }
        int[] freq=new int[10];
        for(int i:max){
            freq[i]++;
        }
        for(int i=0;i<n;i++){
            int target=max[i];
            int t1=nums[i];
            if(freq[target]>1){
                for(int j=i+1;j<n;j++){
                    if(max[j]==target){
                        if(maxsum<t1+nums[j]){
                            maxsum=t1+nums[j];
                        }
                    }
                }
            }
        }
        return maxsum;
    }
}