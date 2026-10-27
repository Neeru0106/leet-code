class Solution {
    public String[] createGrid(int m, int n) {
        char[][] ans=new char[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(ans[i],'#');
        }
        for(int i=0;i<n;i++){
            Arrays.fill(ans[0],'.');
        }
        for(int i=0;i<m;i++){
            ans[i][n-1]='.';
        }
        String[] ans1=new String[m];
        for(int i=0;i<m;i++){
            ans1[i]=new String(ans[i]);
        }
        return ans1;
    }
}