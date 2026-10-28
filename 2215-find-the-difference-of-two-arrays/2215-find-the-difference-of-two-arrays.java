class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        boolean[] freq1=new boolean[2001];
        boolean[] freq2=new boolean[2001];
        for(int i=0;i<nums1.length;i++){
            freq1[nums1[i]+1000]=true;
        }
        for(int i=0;i<nums2.length;i++){
            freq2[nums2[i]+1000]=true;
        }
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(!freq2[nums1[i]+1000]){
                list1.add(nums1[i]);
                freq2[nums1[i]+1000]=true;
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(!freq1[nums2[i]+1000]){
                list2.add(nums2[i]);
                freq1[nums2[i]+1000]=true;
            }
        }
        List<List<Integer>> list=new ArrayList<>();
        list.add(list1);
        list.add(list2);
        return list;
    }
}