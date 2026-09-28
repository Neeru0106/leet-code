class Solution {
    public String smallestNumber(String s) {
        StringBuilder stack=new StringBuilder();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<=s.length();i++){
            stack.append((char)('1'+i));
            if(i==s.length() || s.charAt(i)=='I'){
                sb.append(stack.reverse());
                stack.setLength(0);
            }
        }
        return sb.toString();
    }
}