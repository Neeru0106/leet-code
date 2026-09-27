class Solution 
{
    public int[] rearrangeArray(int[] nums) 
    {
        int n=nums.length;
        int f[]= new int[101];
        for(int i=0;i<n;i++)
        {
            f[nums[i]]++;
        }
        int a[]=new int[n];
        int b=0;
        while(b<n)
        {
            for(int i=1;i<=100;i++)
            {
                if(f[i]>0)
                {
                    a[b]=i;
                    b++;
                    f[i]--;
                }
            }
        }
        return a;
    }
}