class Solution {
    boolean isPrime(int  n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int act=0;
        for(int i=left;i<=right;i++){
            String s=Integer.toString(i,2);
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    count++;
                }
            }
            if(isPrime(count)){
                act++;
            }
        }
        return act;
    }
}