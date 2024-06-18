

//    https://www.geeksforgeeks.org/problems/maximum-tip-calculator2631/1


import java.util.*;
class Solution {
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {

        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++) {
            a[i][0] = arr[i];
            a[i][1] = brr[i];
            a[i][2] = Math.abs(arr[i] - brr[i]);
        }

        Arrays.sort(a, (p, q) -> q[2] - p[2]);
        long ans = 0;

        for (int i = 0; i < n; i++) {
            if (x == 0) {
                ans += a[i][1];
            } else if (y == 0) {
                ans += a[i][0];
            } else {
                if (a[i][0] >= a[i][1]) {
                    ans += a[i][0];
                    x--;
                } else {
                    ans += a[i][1];
                    y--;
                }
            }
        }

        return ans;
    }
}
