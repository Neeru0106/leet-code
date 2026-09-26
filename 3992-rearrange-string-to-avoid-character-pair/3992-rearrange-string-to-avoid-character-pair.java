class Solution {
    public String rearrangeString(String s, char x, char y) {
        int i = 0, j = s.length() - 1;
        char[] arr = s.toCharArray();
        while(i <= j){
            if(arr[i] == x && arr[j] == y){
                swap(arr, i, j);
                i++;
                j--;
            }
            else if(arr[i] == x){
                j--;
            }
            else{
                i++;
            }
        }
        return new String(arr);
    }
    public void swap(char[] arr, int x, int y){
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp; 
    }
}