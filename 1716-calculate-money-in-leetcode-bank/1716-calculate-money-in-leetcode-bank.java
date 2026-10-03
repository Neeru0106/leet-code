class Solution {
    public int totalMoney(int n) {
        int r=(n-(n/7)*7);
        return (n/7)*(7*4) + (n/7)*7*(n/7 -1)/2 + (n/7)*r + (r*(r+1))/2;
    }
}