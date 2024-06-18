

//    https://leetcode.com/problems/find-the-n-th-value-after-k-seconds/


import java.util.*;
class Solution {
    public int valueAfterKSeconds(int n, int k) {

        int mod = 1000000007;
        int[] arr = new int[n];
        Arrays.fill(arr, 1);

        while (k > 0) {
            for (int i = 1; i < n; i++) {
                arr[i] = (arr[i - 1] + arr[i]) % mod;
            }
            k--;
        }

        return arr[n - 1];
    }
}