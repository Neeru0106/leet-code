class Solution 
{
    public int returnToBoundaryCount(int[] nums) 
    {
        int ans = 0;
        int pos=0;
        for (int i=0;i<nums.length;i++) 
        {
            pos+=nums[i]; 
            if (pos== 0) 
                ans++; 
        }
        return ans;
    }
}