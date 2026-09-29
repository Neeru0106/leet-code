class Solution {
    public String originalDigits(String s) {
        char[] c = new char[26];
        int count = 0;
        for (char l : s.toCharArray()) {
            c[l - 'a']++;
            count++;
        }
        StringBuilder sb = new StringBuilder();
        while (count != 0) {
            while (c[25] != 0 && c[4] != 0 && c[17] != 0 && c[14] != 0) {
                sb.append(0);
                c[25]--;
                c[4]--;
                c[17]--;
                c[14]--;
                count -= 4;
            }
            while (c[22] > 0) {
                sb.append(2);
                c[19]--;
                c[22]--;
                c[14]--;
                count -= 3;
            }
            while (c[20] > 0) {
                sb.append(4);
                c[5]--;
                c[14]--;
                c[20]--;
                c[17]--;
                count -= 4;
            }
            while (c[23] > 0) {
                sb.append(6);
                c[18]--;
                c[8]--;
                c[23]--;
                count -= 3;
            }
            while (c[6] > 0) {
                sb.append(8);
                c[4]--;
                c[8]--;
                c[6]--;
                c[7]--;
                c[19]--;
                count -= 5;
            }
            while (c[7] > 0) {
                sb.append(3);
                c[19]--;
                c[7]--;
                c[17]--;
                c[4] -= 2;
                count -= 5;
            }
            while (c[5] > 0) {
                sb.append(5);
                c[5]--;
                c[8]--;
                c[21]--;
                c[4]--;
                count -= 4;
            }
            while (c[18] > 0) {
                sb.append(7);
                c[18]--;
                c[4] -= 2;
                c[21]--;
                c[13]--;
                count -= 5;
            }
            while (c[14] > 0) {
                sb.append(1);
                c[14]--;
                c[13]--;
                c[4]--;
                count -= 3;
            }
            while (c[8] > 0) {
                sb.append(9);
                c[13] -= 2;
                c[8]--;
                c[4]--;
                count -= 4;
            }
        }
        char[] sort1=sb.toString().toCharArray();
        Arrays.sort(sort1);
        return new String(sort1);
    }
}