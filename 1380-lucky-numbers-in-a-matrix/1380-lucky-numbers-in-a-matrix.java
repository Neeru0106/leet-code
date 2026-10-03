class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int[] col=new int[m];
        int[] row=new int[n];
        for(int i=0;i<n;i++){
            int min=matrix[i][0];
            for(int j=1;j<m;j++){
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                }
            }
            row[i]=min;
        }
        for(int i=0;i<m;i++){
            int max=matrix[0][i];
            for(int j=1;j<n;j++){
                if(max<matrix[j][i]){
                    max=matrix[j][i];
                }
            }
            col[i]=max;
        }
        for(int i=0;i<n;i++){
            int target=row[i];
            for(int j=0;j<m;j++){
                if(target==col[j]){
                    list.add(target);
                    break;
                }
            }
        }
        return list;
    }
}