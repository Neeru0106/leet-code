class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        int n=words.length;
        boolean[] b=new boolean[n];
        for(int i=0;i<n;i++){
            if(b[i]) continue;
            b[i]=true;
            StringBuilder s1=new StringBuilder();
            s1.append(words[i]);
            String s2=s1.reverse().toString();
            for(int j=i+1;j<n;j++){
                if(!b[j]){
                   if(s2.equals(words[j])){
                        b[j]=true;
                        count++;
                        break;
                   }
                }
            }
        }
        return count;
    }
}