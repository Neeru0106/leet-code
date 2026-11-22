class Solution {
    public boolean isBalanced(String num) {
        int s1=0;
        int s2=0;
        char[] c=num.toCharArray();
        int n=c.length;
        for(int i=0;i<n;i+=2){
            s1+=(c[i]-'0');
        }
        for(int i=1;i<n;i+=2){
            s2+=(c[i]-'0');
        }
        return s1==s2;
    }
}