

//   https://leetcode.com/problems/student-attendance-record-i/


class Solution {
    public boolean checkRecord(String s) {

        int L = 0;
        int A = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'A') {
                A++;
                L = 0;
                if (A >= 2) {
                    return false;
                }
            } else if (ch == 'L') {
                L++;

                if (L == 3) {
                    return false;
                }
            } else {
                L = 0;
                continue;
            }
        }

        return true;
    }
}