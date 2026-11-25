class Solution {
    public boolean checkTwoChessboards(String s, String t) {
        return !((((s.charAt(0)-'a')%2) == ((t.charAt(0)-'a')%2)) ^  (((s.charAt(1)-'0')%2) == ((t.charAt(1)-'0')%2)));
    }
}