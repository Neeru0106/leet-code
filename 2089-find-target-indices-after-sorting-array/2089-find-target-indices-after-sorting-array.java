class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count1=0;
        int count2=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<target){
                count1++;
            } 
            if((nums[i]^target)==0){
                count2++;
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=count1;i<count1+count2;i++){
            list.add(i);
        }
        return list;
    }
}