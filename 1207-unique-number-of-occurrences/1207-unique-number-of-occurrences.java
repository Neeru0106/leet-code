class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq=new int[2000];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]+1000]++;
        }
        int count=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0){
                continue;
            }
            for(int j=i+1;j<freq.length;j++){
                if(freq[i]==freq[j]){
                    return false;
                }
            }
        } 
        return true;
    }
}