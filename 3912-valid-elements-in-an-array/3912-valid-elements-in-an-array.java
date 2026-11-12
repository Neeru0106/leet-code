class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n=nums.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int maxL=0;
        int maxR=0;
        for(int i=0;i<n;i++){
            left[i]=maxL;
            right[n-i-1]=maxR;
            maxL=Math.max(maxL,nums[i]);
            maxR=Math.max(maxR,nums[n-i-1]);
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>left[i] || nums[i]>right[i]){
                list.add(nums[i]);
            }
        }
        return list;
    }
}