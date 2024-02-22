

//   https://www.geeksforgeeks.org/problems/buy-maximum-stocks-if-i-stocks-can-be-bought-on-i-th-day/1

//   https://www.codingninjas.com/studio/problems/buy-maximum-stocks-if-i-stocks-can-be-bought-on-i-th-day_1169470


import java.util.*;
class Solution {
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = i + 1;
            arr[i][1] = price[i];
        }

        arrSort(arr, 1);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][1] * arr[i][0] < k) {
                count += arr[i][0];
                k -= arr[i][1] * arr[i][0];
            } else {
                int leastShares = k / arr[i][1];
                k -= arr[i][1] * leastShares;
                count += leastShares;
                break;
            }
        }

        return count;
    }

    public static void arrSort(int[][] arr, int col) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[col], b[col]));
    }
}