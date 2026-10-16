class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
        StringBuilder s1=new StringBuilder();
        int n=words.length;
        for(int i=0;i<n;i++){
            if(i!=n-1){
                s1.append(words[n-i-1]+" ");
            } else{
                s1.append(words[n-i-1]);
            }
        }
        return s1.toString();
    }
}