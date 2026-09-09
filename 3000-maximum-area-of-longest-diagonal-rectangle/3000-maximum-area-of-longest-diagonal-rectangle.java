class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxD=0;
        int maxA=0;
        int n=dimensions.length;
        for(int i=0;i<n;i++){
            int len=(dimensions[i][0]*dimensions[i][0]+ dimensions[i][1]*dimensions[i][1]);
            if(maxD<len){
                maxD=len;
                maxA=dimensions[i][0]*dimensions[i][1];
            }
            if(len==maxD){
                if(dimensions[i][0]*dimensions[i][1]>maxA){
                    maxA=dimensions[i][0]*dimensions[i][1];
                }
            }
        }
        return maxA;
    }
}