class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] b=new boolean[51];
        int n=ranges.length;
        for(int i=0;i<n;i++){
            int start=ranges[i][0];
            int end=ranges[i][1];
            Arrays.fill(b,start,end+1,true);
        }
        for(int i=left;i<=right;i++){
            if(!b[i]){
                return false;
            }
        }
        return true;
    }
}