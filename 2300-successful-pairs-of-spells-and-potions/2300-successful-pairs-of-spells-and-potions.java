class Solution {
    static int binarySearch(long success,int[] pro,long e){
        int left=0;
        int n=pro.length;
        int right=pro.length-1;
        int firstValidIndex=n;
        while(left<=right){
            int mid=left+(right-left)/2;
            if ((long) pro[mid] * e >= success) {
                firstValidIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return n-firstValidIndex;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int m=spells.length;
        int n=potions.length;
        int[] ans=new int[m];
        for(int i=0;i<m;i++){
            ans[i]=binarySearch(success,potions,spells[i]);
        }
        return ans;
    }
}