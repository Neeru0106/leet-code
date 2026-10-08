class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        boolean[] freq=new boolean[101];
        for(List<Integer> list:nums){
            int start=list.get(0);
            int end=list.get(1);
            Arrays.fill(freq,start,end+1,true);
        }
        int count=0;
        for(int i=1;i<101;i++){
            if(freq[i]){
                count++;
            }
        }
        return count;
    }
}