class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] freq1=new int[51];
        int n=A.length;
        int[] ans=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            freq1[A[i]]++;
            if(freq1[A[i]]==2){
                count++;
            }
            freq1[B[i]]++;
            if(freq1[B[i]]==2){
                count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}