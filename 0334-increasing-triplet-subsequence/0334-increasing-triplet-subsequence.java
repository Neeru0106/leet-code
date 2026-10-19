class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        int[] max=new int[n];
        int[] min=new int[n];
        min[0]=nums[0];
        max[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            min[i]=Math.min(min[i-1],nums[i]);
        }
        for(int i=n-2;i>=0;i--){
            max[i]=Math.max(max[i+1],nums[i]);
        }
        for(int i=0;i<n;i++){
            if(nums[i]<max[i] && nums[i]>min[i]){
                return true;
            }
        }
        return false;
    }
}