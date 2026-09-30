class Solution {
    public int heightChecker(int[] heights) {
        int[] freq = new int[101];
        for (int n : heights) {
            freq[n]++;
        }
        int count = 0;
        int k = 0;
        for (int i = 1; i <= 100; i++) {
            while (freq[i] != 0) {
                if (heights[k] != i) {
                    count++;
                }
                k++;
                freq[i]--;
            }
        }
        return count;
    }
}