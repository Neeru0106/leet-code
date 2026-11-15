class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        boolean[] arr=new boolean[n+1];
        for(int i:nums){
            arr[i]=true;
        }
        for(int i=0;i<=n;i++){
            if(!arr[i]){
                return i;
            }
        }
        return n;
    }
}