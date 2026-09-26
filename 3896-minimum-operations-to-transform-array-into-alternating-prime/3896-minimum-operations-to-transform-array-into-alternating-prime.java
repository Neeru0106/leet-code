class Solution {
    boolean isP(int n){
        if(n==2 || n==3){
            return true;
        }
        if(n<=1){
            return false;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i=5;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int minOperations(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            while(i%2==0 && !isP(nums[i])){
                nums[i]++;
                count++;
            }
            while(i%2!=0 && isP(nums[i])){
                nums[i]++;
                count++;
            }
        }
        return count;
    }
}