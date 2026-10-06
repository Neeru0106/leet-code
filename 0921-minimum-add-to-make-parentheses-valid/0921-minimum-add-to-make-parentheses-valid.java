class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        char[] c=new char[n];
        int i=0;
        int left=0;
        while(i<n){
            c[left]=s.charAt(i);
            while(left>0 && c[left]==')' && c[left-1]=='('){
                left-=2;
            }
            left++;
            i++;
        }
        return left;
    }
}