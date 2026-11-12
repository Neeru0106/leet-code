import java.util.*;
class Solution {
    public int countGoodSubstrings(String string) {
        if(string.length() < 3) return 0;
        char[] s = string.toCharArray();
        char a=s[0], b=s[1], c=s[2];
        int k=3,count=0,n=string.length();
        for(int i=k; i<n; i++){
            if(a!=b && b!=c && c!=a) count++;
            a=b;
            b=c;
            c=s[i];
        }
        if(a!=b && b!=c && c!=a) count++;
        return count;

    }
}