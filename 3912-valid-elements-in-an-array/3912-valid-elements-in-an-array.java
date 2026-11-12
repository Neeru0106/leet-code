class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int[] maxleft=new int[nums.length];
        int mxl=nums[0];
        maxleft[0]=mxl;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>mxl){mxl=nums[i];}
            maxleft[i]=mxl;
        }
        int[] maxright=new int[nums.length];
        int mxr=nums[nums.length-1];
        maxright[nums.length-1]=mxr;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>mxr){mxr=nums[i];}
            maxright[i]=mxr;
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i==0 || i==nums.length-1){
                ans.add(nums[i]);
                continue;
            }
            if(maxleft[i]>maxleft[i-1] || maxright[i]>maxright[i+1]){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}