class Solution {
    public int distinctSubseqII(String s) {
        int MOD = 1_000_000_007;
        long[] endsIn = new long[26];
        long total = 0; 
        for (char ch : s.toCharArray()) {
            int idx = ch - 'a';
            long newCount = (total + 1) % MOD;
            total = (total - endsIn[idx] + newCount + MOD) % MOD;
            endsIn[idx] = newCount;
        }
        return (int) total;
    }
}