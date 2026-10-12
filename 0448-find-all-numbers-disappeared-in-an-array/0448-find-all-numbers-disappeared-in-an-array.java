import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        boolean[] freq=new boolean[n+1];
        for(int i=0;i<n;i++){
            freq[nums[i]]=true;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<n+1;i++){
            if(!freq[i]){
                list.add(i);
            }
        }
        return list;
    }
}