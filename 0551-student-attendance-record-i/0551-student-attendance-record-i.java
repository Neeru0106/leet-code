class Solution {
    public boolean checkRecord(String s) {
        if(s.indexOf("LLL")>=0){
            return false;
        }
        int a=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A'){
                a++;
            }
        }
        return a<2;
    }
}