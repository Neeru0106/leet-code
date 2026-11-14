class Solution {
    public int findKthLargest(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=nums[i]-min+1;
        }
        int max=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int freq[]=new int[max+1];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        int i=max;
        while(i!=0){
            k-=freq[i];
            if(k<=0){
                return i+min-1;
            }
            i--;
        }
        return -1;
    }
}