class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] arr1=new int[2*nums.length];
        System.arraycopy(nums,0,arr1,0,n);
        System.arraycopy(nums,0,arr1,n,n);
        return arr1;
    }
}