class Solution {
    public int minimumSum(int[] nums) {
        int n=nums.length;
        int[] left=new int[n];
        left[0]=nums[0];
        int sum=Integer.MAX_VALUE;
        boolean isT=false;
        int[] right=new int[n];
        right[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            left[i]=Math.min(left[i-1],nums[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            right[i]=Math.min(right[i+1],nums[i+1]);
        }
        for(int i=1;i<n-1;i++){
            if(nums[i]>left[i] && nums[i]>right[i]){
                sum=Math.min(sum,nums[i]+left[i]+right[i]);
                isT=true;
            }
        }
        if(isT){
            return sum;
        }
        return -1;
    }
}