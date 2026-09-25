class Solution {
    boolean isP(String s){
        int n=s.length()/2;
        int m=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=s.charAt(m-i-1)){
                return false;
            }
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        int n=words.length;
        for(int i=0;i<n;i++){
            if(isP(words[i])){
                return words[i];
            }
        }
        return "";
    }
}