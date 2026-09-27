class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int even1=0;
        int even2=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(even1==0 && nums[i]%2==0){
                even1=nums[i];
            }else if(nums[i]%2==0){
                even2=nums[i];
                break;
            }
        }
        return even1!=0 && even2!=0;
    }
}