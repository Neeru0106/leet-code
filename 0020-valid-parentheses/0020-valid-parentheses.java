class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        int i=0;
        int left=0;
        char[] c=new char[n];
        while(i<n){
            c[left]=s.charAt(i);
            while(left>0 && c[left-1]=='(' && c[left]==')'){
                left-=2;
            }
            while(left>0 && c[left-1]=='[' && c[left]==']'){
                left-=2;
            }
            while(left>0 && c[left-1]=='{' && c[left]=='}'){
                left-=2;
            }
            i++;
            left++;
        }
        return left==0;
    }
}