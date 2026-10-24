class Solution {
    public int countDaysTogether(String aA, String lA, String aB, String lB) {
        int m1 = (aA.charAt(0) - '0') * 10 + (aA.charAt(1) - '0');
        int m2 = (lA.charAt(0) - '0') * 10 + (lA.charAt(1) - '0');
        int m3 = (aB.charAt(0) - '0') * 10 + (aB.charAt(1) - '0');
        int m4 = (lB.charAt(0) - '0') * 10 + (lB.charAt(1) - '0');
        
        int d1 = (aA.charAt(3) - '0') * 10 + (aA.charAt(4) - '0');
        int d2 = (lA.charAt(3) - '0') * 10 + (lA.charAt(4) - '0');
        int d3 = (aB.charAt(3) - '0') * 10 + (aB.charAt(4) - '0');
        int d4 = (lB.charAt(3) - '0') * 10 + (lB.charAt(4) - '0');
        
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int startA = getDayOfYear(m1, d1, daysInMonth);
        int endA   = getDayOfYear(m2, d2, daysInMonth);
        int startB = getDayOfYear(m3, d3, daysInMonth);
        int endB   = getDayOfYear(m4, d4, daysInMonth);
        
        int overlapStart = Math.max(startA, startB);
        int overlapEnd   = Math.min(endA, endB);
        
        return Math.max(0, overlapEnd - overlapStart + 1);
    }
    
    private int getDayOfYear(int month, int day, int[] daysInMonth) {
        int totalDays = day;
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }
        return totalDays;
    }
}