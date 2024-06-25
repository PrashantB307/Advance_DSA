

//   https://leetcode.com/problems/3sum-with-multiplicity/


import java.util.*;
class Solution {
    public int threeSumMulti(int[] arr, int target) {

        int n = arr.length;
        Arrays.sort(arr);
        long ans = 0;
        long mod = 1000000007;

        for (int i = 0; i < n - 2; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                
                if (map.containsKey(target - sum)) {
                    ans = (ans % mod + map.get(target - sum) % mod) % mod;
                }

                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            }

        }

        return (int) (ans % 1000000007);
    }
}