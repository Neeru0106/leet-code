class Solution{
    public boolean isBalanced(String num){
        int i=0,j=1,sum=0;
        while(i<num.length()){
            sum+=num.charAt(i)-'0';
            i+=2;
        }
        while(j<num.length()){
            sum-=num.charAt(j)-'0';
            j+=2;
        }
        return sum==0;
    }
}