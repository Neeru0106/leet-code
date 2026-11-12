class Solution {
    public int countGoodSubstrings(String s) {
        int n=s.length();
        if(n<3){
            return 0;
        }
        int count=0;
        char[] c=s.toCharArray();
        for(int i=2;i<n;i++){
            char c1=c[i-2];
            char c2=c[i-1];
            char c3=c[i];
            if(c1==c2 || c2==c3|| c1==c3){
                continue;
            } else{
                count++;
            }
        }
        return count;
    }
}