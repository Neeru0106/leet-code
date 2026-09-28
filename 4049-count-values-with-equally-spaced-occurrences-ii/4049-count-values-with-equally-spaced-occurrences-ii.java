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
        int count = 0;
        for (List<Integer> indices : map.values()) {
           if (indices.size() < 3) {
                continue;
            }
            int diff = indices.get(1) - indices.get(0);
            boolean isEquallySpaced = true;
            for (int i = 2; i < indices.size(); i++) {
                if (indices.get(i) - indices.get(i - 1) != diff) {
                    isEquallySpaced = false;
                    break;
                }
            }

            if (isEquallySpaced) {
                count++;
            }
        }
        return count;
    }
}