class Solution {
    public int minRotations(String s) {
        int previous=0;
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int max=Math.max((int)(s.charAt(i)-'0'),previous);
            int min=Math.min((int)(s.charAt(i)-'0'),previous);
            count+=(Math.min((max-min),10-max+min));
            previous=(int)(s.charAt(i)-'0');
        }
        return count;
    }
}