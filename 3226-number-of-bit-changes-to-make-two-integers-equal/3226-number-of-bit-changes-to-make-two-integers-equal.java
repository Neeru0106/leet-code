class Solution {
    public int minChanges(int n, int k) {
        String s1=String.format("%20s",Integer.toBinaryString(n)).replace(' ','0');
        String s2=String.format("%20s",Integer.toBinaryString(k)).replace(' ','0');
        int count=0;
        for(int i=0;i<20;i++){
            if(s1.charAt(i)=='1' && s2.charAt(i)=='0'){
                count++;
            } else if(s1.charAt(i)=='0' && s2.charAt(i)=='1'){
                return -1;
            }
        }
        return count;
    }
}