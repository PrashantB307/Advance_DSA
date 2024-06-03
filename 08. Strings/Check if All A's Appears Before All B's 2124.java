

//    https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/


class Solution {
    public boolean checkString(String s) {

        int A = Integer.MIN_VALUE, B = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                if (A > B) {
                    return false;
                }
                A = i;
            } else {
                if (B < A) {
                    return false;
                }
                B = i;
            }
        }

        if (A > B) {
            return false;
        }

        return true;
    }
}