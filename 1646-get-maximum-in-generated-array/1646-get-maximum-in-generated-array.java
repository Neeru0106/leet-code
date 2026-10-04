class Solution {
    public int getMaximumGenerated(int n) {
        int[] generated=new int[n+1];
        int max=0;
        if(n==0){
            return 0;
        }
        if(n<=2){
            return 1;
        }
        generated[0]=0;
        generated[1]=1;
        generated[2]=1;
        for(int i=3;i<=n;i++){
            if(i%2==0){
                generated[i]=generated[i/2];
            } else{
                generated[i]= generated[i/2]+generated[i/2 + 1];
            }
            if(max<generated[i]){
                max=generated[i];
            }
        }
        return max;
    }
}