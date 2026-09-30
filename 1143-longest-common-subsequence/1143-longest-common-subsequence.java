class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        char[] x=text1.toCharArray();
        char[] y=text2.toCharArray();
        int[][] path=new int[n+1][m+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(x[i]==y[j]){
                    path[i+1][j+1]=1+path[i][j];
                }
                else {
                    path[i+1][j+1]=Math.max(path[i+1][j],path[i][j+1]);
                }
            }
        }
        return path[n][m];
    }
}