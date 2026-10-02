class Solution {
    public int dominantIndices(int[] nums) {
        int n=nums.length;
        float[] x=new float[n];
        x[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            x[i]=x[i+1]+nums[i];
        }
        int k=n-1;
        int count=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]>(int)(x[i+1]/k--)){
                count++;
            }
        }
        return count;
    }
}