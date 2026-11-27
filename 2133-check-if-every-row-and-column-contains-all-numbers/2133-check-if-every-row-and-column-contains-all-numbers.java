class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        for(int j=0;j<n;j++){
            boolean[] count=new boolean[n+1];
            for(int i=0;i<n;i++){
                if(!count[matrix[i][j]]){
                    count[matrix[i][j]]=true;
                } else{
                    return false;
                }
            }
        }
        for(int i=0;i<n;i++){
            boolean[] count=new boolean[n+1];
            for(int j=0;j<n;j++){
                if(!count[matrix[i][j]]){
                    count[matrix[i][j]]=true;
                } else{
                    return false;
                }
            }
        }
        return true;
    }
}