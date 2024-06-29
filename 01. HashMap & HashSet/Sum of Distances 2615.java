

//    https://leetcode.com/problems/sum-of-distances/


import java.util.*;
class Solution {
    public long[] distance(int[] arr) {
        
        int n = arr.length;
        Map<Integer, List<Integer>> mp = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            mp.putIfAbsent(arr[i], new ArrayList<>());
            mp.get(arr[i]).add(i);
        }
        
        long[] ans = new long[n];
        
        for (Map.Entry<Integer, List<Integer>> entry : mp.entrySet()) {
            List<Integer> vec = entry.getValue();
            long sum = 0;
            for (int i : vec) {
                sum += i;
            }
            
            long currSum = 0, restSum = 0;
            for (int i = 0; i < vec.size(); i++) {
                restSum = sum - currSum - vec.get(i);
                long forLeft = vec.get(i) * (long)i - currSum;
                long forRight = restSum - vec.get(i) * (long)(vec.size() - i - 1);
                ans[vec.get(i)] = forLeft + forRight;
                currSum += vec.get(i);
            }
        }
        
        return ans;
    }
}