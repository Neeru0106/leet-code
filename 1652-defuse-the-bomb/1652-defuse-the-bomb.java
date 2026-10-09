class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int temp=Math.abs(k);
            while(temp!=0){
                if(k<0){
                    ans[i]+=code[(i-temp+n)%n];
                    temp--;
                } else{
                    ans[i]+=code[(i+temp+n)%n];
                    temp--;
                }
            }
        }
        return ans;
    }
}