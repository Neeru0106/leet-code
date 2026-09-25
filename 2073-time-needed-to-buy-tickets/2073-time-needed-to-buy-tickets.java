class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets[k];
        int l=tickets.length;
        int count=0;
        for(int i=0;i<l;i++){
            if(i<=k)
                count+=Math.min(n,tickets[i]);
            else 
                count+=Math.min(n-1,tickets[i]);
        }
        return count;
    }
}