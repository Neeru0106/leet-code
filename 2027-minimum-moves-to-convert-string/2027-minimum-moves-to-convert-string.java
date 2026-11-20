class Solution {
    public int minimumMoves(String s) {
        char[] c=s.toCharArray();
        int n=c.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(c[i]=='X'){
                i+=2;
                count++;
            }
        }
        return count;
    }
}