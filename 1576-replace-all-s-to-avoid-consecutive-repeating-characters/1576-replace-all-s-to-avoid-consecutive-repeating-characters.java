class Solution {
    public String modifyString(String s) {
        char[] c=s.toCharArray();
        if(c[0]=='?'){
            if(c.length==1){
                return "a";
            }
            else {
               char c2='a';
               while(c2==c[1]){
                    if(c2=='z'){
                        c2='a';
                    }
                    c2++;
               }
               c[0]=c2;
            }
        }
        int n=c.length;
        if(c[n-1]=='?'){
            char c2='a';
             while(c2==c[n-2]){
                    if(c2=='z'){
                        c2='a';
                    }
                    c2++;
               }
            c[n-1]=c2;
        }
        for(int i=1;i<n-1;i++){
            if(c[i]=='?'){
                char c2='a';
                while(c2==c[i-1] || c2==c[i+1]){
                    if(c2=='z'){
                        c2='a';
                        continue;
                    }
                    c2++;
                }
                c[i]=c2;
            }
        }
        return new String(c);
    }
}