class Solution {
    public int countCommas(int n) {
        int count=0;
        int digits=(int)Math.log10(n)+1;
        if(digits>9){
            count+=(n-999999999)*(digits-1)/3;
            n=999999999;
            digits=9;
        } 
        if(digits>6){
            count+=(n-999999)*2;
            n=999999;
            digits=6;
        }
        if(digits>3){
            count+=(n-999)*1;
            n=999;
            digits=3;
        }
        return count;
    }
}