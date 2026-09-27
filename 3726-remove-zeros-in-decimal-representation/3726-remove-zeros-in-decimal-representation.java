class Solution {
    public long removeZeros(long n) {
        long ans=0;
        long pow=1;
        while(n!=0){
            long rem=n%10;
            n/=10;
            if(rem!=0){
                ans=ans+pow*rem;
                pow*=10;
            }
        }
        return ans;
    }
}