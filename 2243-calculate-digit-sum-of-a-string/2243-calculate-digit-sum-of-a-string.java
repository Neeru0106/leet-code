class Solution {
    public String digitSum(String s, int k) {
        int n=s.length();
        while(n>k){
            int i=0;
            StringBuilder s1=new StringBuilder();
            while(i<n){
                int sum=0;
                for(int j=i;j<i+k && j<n;j++){
                    sum+=(s.charAt(j)-'0');
                }
                s1.append(sum);
                i+=k;
            }
            s=s1.toString();
            n=s.length();
        }
        return s;
    }
}