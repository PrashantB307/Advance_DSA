

//   https://www.geeksforgeeks.org/problems/maximize-arrii-of-an-array0026/1


import java.util.*;
class Solution {

    int Maximize(int arr[], int n) {
        Arrays.sort(arr);

        long sum = 0;
        long mod = 1000000007;
        for (int i = 0; i < n; i++) {
            sum = (sum + (arr[i] * i) % mod) % mod;
        }

        return (int)(sum % mod);

    }
}
