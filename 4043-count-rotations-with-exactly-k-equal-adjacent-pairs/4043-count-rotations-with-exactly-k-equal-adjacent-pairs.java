class Solution {
    public int score(char[] c){
        int n=c.length;
        int score=0;
        for(int i=0;i<n-1;i++){
            if(c[i]==c[i+1]){
                score++;
            }
        }
        return score;
    }
    public int countRotations(String s, int k) {
        char[] c=s.toCharArray();
        int n=s.length();
        int cycle=0;
        int n1=s.length();
        while(n-->0){
            char c1=c[0];
            for(int i=0;i<n1-1;i++){
                c[i]=c[i+1];
            }
            c[n1-1]=c1;
            if(score(c)==k){
                cycle++;
            }
        }
        return cycle;
    }
}