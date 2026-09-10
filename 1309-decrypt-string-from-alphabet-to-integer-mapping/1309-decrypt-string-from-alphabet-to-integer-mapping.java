class Solution {
    public String freqAlphabets(String s) {
        StringBuilder s1=new StringBuilder();
        int right=s.length()-1;
        while(right>=0){
            if(s.charAt(right)=='#'){
                right--;
                int n1=s.charAt(right)-'0';
                right--;
                int n2=s.charAt(right)-'0';
                n2=(n2*10)+n1;
                s1.append((char)('a'+n2-1));
            }
            else{
                s1.append((char)((int)(s.charAt(right)-'0'-1)+'a'));
            }
            right--;
        }
        return s1.reverse().toString();
    }
}