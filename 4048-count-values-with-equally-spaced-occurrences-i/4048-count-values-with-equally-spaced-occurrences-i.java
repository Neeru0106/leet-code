class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n=nums.length;
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
           if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
           }
           map.get(nums[i]).add(i);
        }
        int count=0;
        for(List<Integer> index:map.values()){
            if(index.size()==3){
                if(index.get(0)-index.get(1)==index.get(1)-index.get(2)){
                    count++;
                }
            }
        }
        return count;
    }
}