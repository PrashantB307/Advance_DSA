

//   https://www.geeksforgeeks.org/problems/subarrays-with-k-different-integers/1

//   https://leetcode.com/problems/subarrays-with-k-different-integers/

//   https://www.naukri.com/code360/problems/subarrays-with-at-most-k-distinct-values_1473804


import java.util.*;
class Solution {

    static int subarrayCount(int arr[], int N, int k) {

        return helper(arr, N, k) - helper(arr, N, k - 1);
    }

    static int helper(int arr[], int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int cnt = 0;
        int i = 0, j = 0;

        while (i < n && j < n) {
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);

            while (map.size() > k) {
                map.put(arr[i], map.get(arr[i]) - 1);

                if (map.get(arr[i]) == 0) {
                    map.remove(arr[i]);
                }

                i++;
            }

            if (map.size() <= k) {
                cnt += (j - i) + 1;
            }

            j++;
        }

        return cnt;
    }
}