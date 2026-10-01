class Solution {
    public long minCuttingCost(int n, int m, int k) {
        long cost=0;
        if(n>k){
            while(n>k){
                cost+=(long)(n-k)*k;
                n-=k;
            }
        }
        if(m>k){
            while(m>k){
                cost+=(long)(m-k)*k;
                m-=k;
            }
        }
        return cost;
    }
}