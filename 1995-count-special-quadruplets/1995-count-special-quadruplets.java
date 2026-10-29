class Solution {
    public int countQuadruplets(int[] nums) {
        boolean[] freq=new boolean[101];
        int count=0;
        for(int n:nums){
            freq[n]=true;
        }
        int n=nums.length;
        for(int i=0;i<n-3;i++){
            int n1=nums[i];
            for(int j=i+1;j<n-2;j++){
                int n2=nums[j];
                if(n1+n2<=100)
                for(int k=j+1;k<n-1;k++){
                    int n3=nums[k];
                    if(n1+n2+n3<=100 && freq[n1+n2+n3]){
                        int sum=n1+n2+n3;
                        for(int l=k+1;l<n;l++){
                            if(nums[l]==sum)
                                count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}