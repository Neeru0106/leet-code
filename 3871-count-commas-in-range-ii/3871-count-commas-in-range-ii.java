class Solution {
    public long countCommas(long n) {
        long count = 0;
        if (n > 999_999_999_999_999L) { 
            count += (n - 999_999_999_999_999L) * 5;
            n = 999_999_999_999_999L;
        }
        if (n > 999_999_999_999L) {
            count += (n - 999_999_999_999L) * 4;
            n = 999_999_999_999L;
        }
        if (n > 999_999_999L) {
            count += (n - 999_999_999L) * 3;
            n = 999_999_999L;
        }
        if (n > 999_999L) { 
            count += (n - 999_999L) * 2;
            n = 999_999L;
        }
        if (n > 999L) { 
            count += (n - 999L) * 1;
        }

        return count;
    }
}