

//    https://leetcode.com/problems/second-largest-digit-in-a-string/


class Solution {
    public int secondHighest(String s) {

        int max1 = -1;
        int max2 = -1;

        for (char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                int num = (int) ch;
                if (num > max1) {
                    max2 = max1;
                    max1 = num;
                } else if (num > max2 && num != max1) {
                    max2 = num;
                }
            }
        }

        if (max2 == -1) {
            return -1;
        }
        if (max1 == max2) {
            return -1;
        }

        return max2 - 48;
    }
}