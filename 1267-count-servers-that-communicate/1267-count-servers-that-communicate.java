class Solution {
    public int countServers(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[] left=new int[n];
        int[] right=new int[m];
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(grid[j][i]==1){
                    count++;
                }
            }
            right[i]=count;
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
            left[i]=count;
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && (left[i]>=2 || right[j]>=2)){
                    count++;
                }
            }
        }
        return count;
    }
}