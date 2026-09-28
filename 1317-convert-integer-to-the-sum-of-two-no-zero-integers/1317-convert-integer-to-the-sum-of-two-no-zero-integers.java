class Solution {
    boolean isT(int n){
        while(n!=0){
            if(n%10==0){
                return false;
            }
            n/=10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
            if(isT(i) && isT(n-i)){
                return new int[] {i,n-i};
            }
        }
        return new int[]{1,n-1};
    }
}