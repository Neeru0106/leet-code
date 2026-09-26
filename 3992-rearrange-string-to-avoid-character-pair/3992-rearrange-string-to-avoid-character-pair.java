class Solution {
    public String rearrangeString(String s, char x, char y) {
        int[] freq=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<freq[y-'a'];i++){
            sb.append(y);
        }
        freq[y-'a']=0;
        for(int i=0;i<26;i++){
            if(i!=(int)(x-'a')){
                if(freq[i]!=0){
                    while(freq[i]!=0){
                        sb.append((char)(i+'a'));
                        freq[i]--;
                    }
                }
            }
        }
        for(int i=0;i<freq[x-'a'];i++){
            sb.append(x);
        }
        return sb.toString();
    }
}