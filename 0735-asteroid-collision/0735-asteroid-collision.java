class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        int i=0;
        int left=0;
        int[] freq=new int[n];
        while(i<n){
            freq[left]=asteroids[i];
            while(left>0 && freq[left-1]>0 && freq[left]<0){
                int temp=freq[left];
                if(freq[left-1]==Math.abs(freq[left])){
                    left-=2;
                } else if(freq[left-1]> Math.abs(freq[left])){
                    left--;
                } else{
                    left--;
                    freq[left]=temp;
                }
            }
            i++;
            left++;
        }
        int[] ans=new int[left];
        for(i=0;i<left;i++){
            ans[i]=freq[i];
        }
        return ans;
    }
}