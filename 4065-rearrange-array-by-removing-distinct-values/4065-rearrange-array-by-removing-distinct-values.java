class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] freq=new int[101];
        int k=0;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        for(int i=1;i<=100 && k<n;i++){
            for(int j=1;j<=100;j++){
                if(freq[j]!=0){
                    ans[k++]=j;
                    freq[j]--;
                }
            }
        }
        return ans;
    }
}