class Solution {
    public int[] sumZero(int n) {
       int start=n/2;
       int[] freq=new int[n];
       for(int i=0;i<n/2;i++){
            freq[i]=-start;
            freq[n-i-1]=start;
            start++;
       }
       return freq;
    }
}