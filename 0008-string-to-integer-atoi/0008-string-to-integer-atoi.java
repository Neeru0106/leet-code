class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        if(n==0){
            return 0;
        }
        long count=0;
        int i=0;
        boolean check=false;
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if(i==n){
            return 0;
        }
        if(s.charAt(i)=='-'){
            check=true;
            i++;
        }
        else if(s.charAt(i)=='+'){
            i++;
        }
        for(int j=i;j<n;j++){
            if(s.charAt(j)>='0' && s.charAt(j)<='9'){
                count=(count*10)+(s.charAt(j)-'0');
            }
            else{
                break;
            }
            if(!check && count>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            else if(check && -count<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        if(check){
            count=-count;
        }
        return (int)count;
    }
}