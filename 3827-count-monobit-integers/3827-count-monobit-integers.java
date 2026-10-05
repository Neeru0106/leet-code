class Solution {
    public int countMonobit(int n) {
        int count=1;
        int pow=0;
        int product=2;
        while(n>=product-1){
            product*=2;
            pow++;
        }
        return count+pow;
    }
}