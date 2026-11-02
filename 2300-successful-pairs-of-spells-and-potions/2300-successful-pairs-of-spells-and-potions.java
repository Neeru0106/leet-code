class Solution {
    private static int binarySearch(int k, int[] potions, int m) {
        int l = 0, r = m - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (potions[mid] >= k) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int[] result = new int[n];

        int m = potions.length;
        int maxPotion = potions[m - 1];

        for (int i = 0; i < n; i++) {
            int spell = spells[i];
            long k = (success + spell - 1) / spell; 
            if (k <= maxPotion) {
                result[i] = m - binarySearch((int) k, potions, m);
            }
        }
        return result;
    }
}