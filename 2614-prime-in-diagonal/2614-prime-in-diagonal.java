class Solution {
    boolean isP(int n){
        if(n<=1){
            return false;
        }
        if((n^2)==0 || (n^3)==0){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i=5;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(isP(nums[i][i])){
                if(max<nums[i][i]){
                    max=nums[i][i];
                }
            }
            if(isP(nums[n-i-1][i])){
                if(max<nums[n-i-1][i]){
                    max=nums[n-i-1][i];
                }
            }
        }
        return max;
    }
}