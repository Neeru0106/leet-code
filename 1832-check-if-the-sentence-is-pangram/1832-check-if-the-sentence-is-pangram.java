class Solution {
    public boolean checkIfPangram(String s) {
        boolean[] freq=new boolean[26];
        if(s.toCharArray().length<26) return false;
        for(char c:s.toCharArray()){
            freq[c-'a']=true;
        } 
        for(int i=0;i<26;i++){
            if(!freq[i]){
                return false;
            }
        }
        return true;
    }
}