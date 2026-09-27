class Solution {
    public double trimMean(int[] arr) {
        int n=arr.length;
        int last=n/20;
        Arrays.sort(arr);
        double sum=0;
        for(int i=last;i<n-last;i++){
            sum+=(arr[i]);
        }
        return sum/(n-2*last);
    }
}