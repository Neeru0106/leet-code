class Solution {
    public int minChanges(String s) {
        char[] c=s.toCharArray();
        int c1=0;// count ones
        int c2=0;// count zeros
        int n=c.length;
        for(char s1:c){
            if(s1=='1'){
                c1++;
            } else{
                c2++;
            }
        }
        int count=0;
        for(int i=0;i<n;i+=2){
            if(c[i]!=c[i+1]){
                count++;
            }
        }
        return count;
    }
}