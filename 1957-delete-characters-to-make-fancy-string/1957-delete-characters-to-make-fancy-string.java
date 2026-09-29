class Solution {
    public String makeFancyString(String s) {
        int n=s.length();
        char[] c=new char[n];
        c[0]=s.charAt(0);
        if(n>1){
            c[1]=s.charAt(1);
        }
        if(n<=2){
            return s;
        }
        int k=2;
        for(int i=2;i<n;i++){
            char c1=s.charAt(i);
            if(c1==c[k-1] && c1==c[k-2]){
                continue;
            }
            c[k++]=c1;
        }
        return new String(c).substring(0,k);
    }
}