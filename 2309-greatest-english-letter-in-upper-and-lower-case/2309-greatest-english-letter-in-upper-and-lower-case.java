class Solution {
    public String greatestLetter(String s) {
        boolean[] c1=new boolean[26];
        boolean[] c2=new boolean[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c<'a'){
                c1[c-'A']=true;
            } else{
                c2[c-'a']=true;
            }
        }
        for(int i=25;i>=0;i--){
            if(c1[i] && c2[i]){
                char c=(char)('A'+i);
                return new String(c+"");
            }
        }
        return "";
    }
}