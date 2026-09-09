class Solution {
    public int maxDifference(String s) {
        int[] c = new int[26];
        for (char ch : s.toCharArray()) {
            c[ch - 'a']++;
        }
        int mine = Integer.MAX_VALUE;
        int maxo = 0;
        for (int i = 0; i < 26; i++) {
            if (c[i] > 0 && c[i] % 2 == 0) {
                mine = Math.min(mine, c[i]);
            }
            if (c[i] % 2 != 0) {
                maxo = Math.max(maxo, c[i]);
            }
        }
        return maxo - mine;
    }
}