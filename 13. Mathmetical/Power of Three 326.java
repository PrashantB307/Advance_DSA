

//   https://leetcode.com/problems/power-of-three/

//   https://www.geeksforgeeks.org/problems/check-a-integer-is-power-of-3-or-not3850/1


class Solution {
    public boolean isPowerOfThree(int n) {

        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0 && n > 1) {
            n = n / 3;
        }

        if (n > 1) {
            return false;
        }

        return true;
    }
}