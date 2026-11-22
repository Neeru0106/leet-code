class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[][] freq=new int[26][2];
        char[] c=s.toCharArray();
        freq[c[0]-'a'][0]=0;
        int n=c.length;
        for(int i=1;i<n;i++){
            if(c[i]==c[0]){
                freq[c[i]-'a'][1]=i;
            } else{
                if(freq[c[i]-'a'][0]==0){
                    freq[c[i]-'a'][0]=i;
                } else{
                    freq[c[i]-'a'][1]=i;
                }
            }
        }
        for(int i=0;i<26;i++){
            if(freq[i][1]!=0 && freq[i][1]-freq[i][0]-1 !=distance[i]){
                return false;
            }
        }
        return true;
    }
}