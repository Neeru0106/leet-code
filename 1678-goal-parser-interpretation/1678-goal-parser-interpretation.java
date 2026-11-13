class Solution {
    public String interpret(String command) {
        char[] c=command.toCharArray();
        int n=c.length;
        StringBuilder s=new StringBuilder();
        int i=0;
        while(i<n){
            if(c[i]=='(' && c[i+1]==')'){
                s.append('o');
                i+=2;
            }
            else if(c[i]=='('){
                s.append("al");
                i+=4;
            }else{
                s.append('G');
                i++;
            }
        }
        return s.toString();
    }
}