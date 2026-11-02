class Solution {
    public int minMergedInteger(int[] nums) {
        int sum=0;
        int max=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i+=2){
            int n1=nums[i];
            int n2=nums[i+1];
            int pow=(int)(Math.log10(n2)+1);
            sum=(int)(n1*(int)Math.pow(10,pow))+n2;
            if(sum<max){
                max=sum;
            }
        }
        return max;
    }
}