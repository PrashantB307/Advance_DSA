

//   https://practice.geeksforgeeks.org/problems/absolute-difference-divisible-by-k/1
 

import java.util.*;
class Solution {
	static long countPairs(int n, int[] arr, int k) {
		
        HashMap<Integer, Integer> mp = new HashMap<>();
        long ans = 0;

        for(int i = 0; i < n; i++){
            ans += mp.getOrDefault(arr[i] % k, 0);
            mp.put(arr[i] % k, mp.getOrDefault(arr[i] % k, 0) + 1);
        }
        
        return ans;
	}
}