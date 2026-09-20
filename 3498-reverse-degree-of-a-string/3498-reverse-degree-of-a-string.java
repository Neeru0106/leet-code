class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int m=s.charAt(i)-'a';
            sum+=((26-m)*(i+1));
        }
        return sum;
    }
}