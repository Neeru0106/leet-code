class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq=new int[101];
        int n=nums.length;
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        int maxf=0;
        for(int i=0;i<101;i++){
            if(freq[i]>maxf){
                maxf=freq[i];
            }
        }
        int count=0;
        for(int i=0;i<101;i++){
            if(freq[i]==maxf){
                count+=maxf;
            }
        }
        return count;
    }
}