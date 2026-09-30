class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] freq1=new int[51];
        int[] freq2=new int[51];
        int n=A.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            freq1[A[i]]++;
            freq2[B[i]]++;
            for(int j=i;j>=0;j--){
                if(freq1[B[j]]!=0){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}