class Solution {
    public int countTriples(int n) {
        int count=0;
        for(long i=5;i<=n;i++){
            long right=i-1;
            long left=1;
            while(left<right){
                long res=(left*left)+(right*right);
                if(res==i*i){
                    count+=2;
                    left++;
                    right--;
                }
                else if(res<i*i){
                    left++;
                } else{
                    right--;
                }
            }
        }
        return count;
    }
}