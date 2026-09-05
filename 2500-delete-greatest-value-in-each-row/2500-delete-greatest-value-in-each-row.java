class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            Arrays.sort(grid[i]);
        }
        int sum=0;
        for(int j=m-1;j>=0;j--){
            int max=grid[0][j];
            for(int i=1;i<n;i++){
                max=Math.max(grid[i][j],max);
            }
            sum+=max;
        }
        return sum;
    }
}