class Solution {
    public boolean checkString(String s) {
        int idxb=Integer.MAX_VALUE;
        int idxa=Integer.MIN_VALUE;
        char[] c=s.toCharArray();
        int n=c.length;
        for(int i=0;i<n;i++){
            if(c[i]=='a'){
                if(i>idxb){
                    return false;
                } else{
                    idxa=Math.max(idxa,i);
                }
            }
            else{
                if(i<idxa){
                    return false;
                } else{
                    idxb=Math.min(idxb,i);
                }
            }
        }
        return true;
    }
}