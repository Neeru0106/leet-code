class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n=rain.length;
        String[] s=new String[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(i<n-1 && rain[i]==1 && rain[i+1]==1 && count>=0){
                s[i]="Alice";
                count--;
            } else if(rain[i]==1){
                s[i]="Bob";
                count++;
            } else{
                s[i]="None";
            }
        }
        return s;
    }
}