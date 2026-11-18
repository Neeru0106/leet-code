class Solution {
    public int minChanges(String s) {
        char[] c=s.toCharArray();
        int n=c.length;
        int count=0;
        for(int i=0;i<n;i+=2){
            if(c[i]!=c[i+1]){
                count++;
            }
        }
        return count;
    }
}