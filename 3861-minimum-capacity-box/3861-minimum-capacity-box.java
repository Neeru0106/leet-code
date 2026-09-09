class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int index=-1;
        int n=capacity.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(capacity[i]==itemSize){
                return i;
            } else if(capacity[i]>itemSize && capacity[i]<min){
                min=capacity[i];
                index=i;
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return index;
    }
}