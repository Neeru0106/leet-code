class Solution {
    public int minBitFlips(int start, int goal) {
        int count=0; 
        while(start!=0 || goal!=0){
            int rem1=start%2;
            int rem2=goal%2;
            start/=2;
            goal/=2;
            if(rem1!=rem2){
                count++;
            }
        }
        return count;
    }
}