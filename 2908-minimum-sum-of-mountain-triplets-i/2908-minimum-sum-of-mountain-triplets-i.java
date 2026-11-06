class Solution {
    public int minimumSum(int[] nums) {
        int n=nums.length;
        int sum=300;
        for(int i=0;i<n;i++){
            int target=nums[i];
            for(int j=i+1;j<n;j++){
                int target2=nums[j];
                if(target<target2){
                    for(int k=j+1;k<n;k++){
                        int target3=nums[k];
                        if(target3<target2){
                            sum=Math.min(sum,target+target2+target3);
                        }
                    }
                }
            }
        }
        if(sum==300){
            return -1;
        }
        return sum;
    }
}