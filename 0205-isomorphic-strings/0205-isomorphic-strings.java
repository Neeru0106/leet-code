class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] c=new char[128];
        char[] c2=new char[128];
        int n=s.length();
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        int i=0;
        for(char c1:s1){
            if(c[c1]=='\0' && c2[s2[i]]=='\0'){
                c[c1]=s2[i];
                c2[s2[i]]=c1;
            } else if(c[c1]!=s2[i] || c2[s2[i]]!=c1){
                return false;
            }
            i++;
        }
        return true;
    }
}