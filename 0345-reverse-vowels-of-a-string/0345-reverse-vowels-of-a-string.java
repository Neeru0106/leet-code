import java.util.ArrayList;
class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        char[] c1=s.toCharArray();
        int n=s.length();
        String s1=s.toLowerCase();
        for(int i=0;i<n;i++){
            char c=s1.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                list.add(c1[i]);
            }
        }
        int m=list.size()-1;
        for(int i=0;i<n;i++){
            char c=s1.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                c1[i]=list.get(m--);
            }
        }
        return new String(c1);
    }
}