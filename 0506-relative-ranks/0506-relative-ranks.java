class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] s = new String[n];
        for (int rank = 1; rank <= n; rank++) {
            int max = -1;
            int maxidx = -1;
            for (int j = 0; j < n; j++) {
                if (score[j] > max) {
                    max = score[j];
                    maxidx = j;
                }
            }
            if (rank == 1) {
                s[maxidx] = "Gold Medal";
            } else if (rank == 2) {
                s[maxidx] = "Silver Medal";
            } else if (rank == 3) {
                s[maxidx] = "Bronze Medal";
            } else {
                s[maxidx] = String.valueOf(rank);
            }
            score[maxidx] = -1; 
        }
        return s;
    }
}