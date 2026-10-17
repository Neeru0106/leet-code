class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        int n=s.length();
        int m=t.length();
        if(n<1){
            return true;
        }
        while(j<m){
            if(c1[i]==c2[j]){
                i++;
            }
            if(i==n){
                return true;
            }
            j++;
        }
        return false;
    }
}