class Solution {
    public int Csort(int[] arr){
        int i=0;
        int n=arr.length;
        while(i<n){
            int correct=arr[i];
            if(arr[i]<n && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            } else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return n;
    }
    void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int missingNumber(int[] nums) {
        return Csort(nums);
    }
}