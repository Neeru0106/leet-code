class Solution {
    boolean isT(int n,int k){
        int count=0;
        while(n!=0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count==k;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int n=nums.size();
        int sum=0;
        for(int i=0;i<n;i++){
            if(isT(i,k)){
                sum+=nums.get(i);
            }
        }
        return sum;
    }
}