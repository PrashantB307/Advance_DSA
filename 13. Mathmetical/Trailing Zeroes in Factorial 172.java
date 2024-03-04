

//   https://www.geeksforgeeks.org/problems/trailing-zeroes-in-factorial5134/1

//   https://leetcode.com/problems/factorial-trailing-zeroes/


class Solution {
    static int trailingZeroes(int N) {
        int cnt = 0;

        for (int i = 5; i <= N; i *= 5) {
            cnt += N / i;
        }

        return cnt;
    }
}