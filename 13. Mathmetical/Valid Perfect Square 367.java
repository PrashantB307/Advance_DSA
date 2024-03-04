

//   https://leetcode.com/problems/valid-perfect-square/

//   https://www.geeksforgeeks.org/problems/check-perfect-square5253/1

class Solution {
    public boolean isPerfectSquare(int num) {

        long i = 2;
        long j = num / 2;

        if (num == 1) {
            return true;
        }

        while (i <= j) {
            long mid = i + (j - i) / 2;

            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return false;

    }
}