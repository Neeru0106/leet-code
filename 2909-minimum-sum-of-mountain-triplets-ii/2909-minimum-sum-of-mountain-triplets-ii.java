class Solution {
    public int minimumSum(int[] nums) {
        int n=nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0]=Integer.MAX_VALUE;
        right[n-1]=Integer.MAX_VALUE;
        int i=1,j=n-2;
        while(i<n && j>=0){
            left[i]=Math.min(left[i-1],nums[i-1]);
            right[j]=Math.min(right[j+1],nums[j+1]);
            i++;
            j--;
        }
        int mini=Integer.MAX_VALUE;
        for(int k=1;k<n-1;k++){
            if(left[k]<nums[k] && nums[k]>right[k]){
                mini=Math.min(mini,left[k]+nums[k]+right[k]);
            }
        }
        return mini==Integer.MAX_VALUE?-1:mini;
    }
}