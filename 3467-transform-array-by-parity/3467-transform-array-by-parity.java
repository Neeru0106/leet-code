class Solution {
    public int[] transformArray(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                count++;
            }
        }
        int[] freq=new int[n];
        Arrays.fill(freq,count,n,1);
        return freq;
    }
}