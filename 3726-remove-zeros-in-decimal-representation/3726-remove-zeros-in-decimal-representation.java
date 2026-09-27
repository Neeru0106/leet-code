class Solution {
    public long removeZeros(long n) {
        String s=Long.toString(n,10);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                sb.append(s.charAt(i));
            }
        }
        return Long.parseLong(sb.toString());
    }
}