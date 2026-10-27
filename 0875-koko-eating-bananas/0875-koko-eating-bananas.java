class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        long total = 0;

        for (int pile : piles) {
            total += pile;
        }

        int left = (int)((total + h - 1) / h);
        int right = (int)((total + h - n) / (h - n + 1));
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            int hrs = 0;

            for (int pile : piles) {
                hrs += (pile + mid - 1) / mid;
                if (hrs > h) {
                    break;
                }
            }
            if (hrs <= h) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }
}