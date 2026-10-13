class Solution {
    void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int largestInteger(int num) {
        int digits=(int)Math.log10(num)+1;
        int[] arr=new int[digits];
        for(int i=digits-1;i>=0;i--){
            arr[i]=num%10;
            num/=10;
        }
        int n=digits;
        for(int i=0;i<n-1;i++){
            int temp=arr[i];
            int idx=i;
            for(int j=i+1;j<n;j++){
                if((temp%2==arr[j]%2)&& arr[j]>temp){
                    idx=j;
                    temp=arr[j];
                }
            }
            swap(arr,i,idx);
        }
        int num1=0;
        for(int i=0;i<n;i++){
            num1=(num1*10)+arr[i];
        }
        return num1;
    }
}