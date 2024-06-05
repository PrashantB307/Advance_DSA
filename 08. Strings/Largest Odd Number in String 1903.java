

//   https://www.geeksforgeeks.org/problems/largest-odd-number-in-string/1

//   https://leetcode.com/problems/largest-odd-number-in-string/


class Solution {

    String maxOdd(String s) {

        for (int i = s.length() - 1; i >= 0; i--) {
            int ch = s.charAt(i) - '0';
            if (ch % 2 == 1) {
                return s.substring(0, i + 1);
            }
        }

        return "";
    }
}