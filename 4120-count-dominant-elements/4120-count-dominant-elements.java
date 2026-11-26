class Solution {
    public int countDominantElements(int[] nums) {
        int count=0;
        int n=nums.length;
        if(n<2){
            return n;
        }
        for(int i=0;i<n;i++){
            if(i==0){
                if(nums[i]>=nums[i+1]){
                    count++;
                }
            } else if(i==n-1){
                if(nums[i]>=nums[i-1]){
                    count++;
                }
            }
            else{
                if(nums[i]*2>=nums[i-1]+nums[i+1]){
                    count++;
                }
            }
        }
        return count;
    }
}