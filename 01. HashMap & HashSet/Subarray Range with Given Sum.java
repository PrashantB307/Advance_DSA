

//    https://www.geeksforgeeks.org/problems/subarray-range-with-given-sum0128/1


import java.util.*;
class Solution {
    static int subArraySum(int arr[], int tar) {

        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int cnt = 0;
        int curr_Sum = 0;

        for(int i = 0; i < n; i++){
            curr_Sum += arr[i];

            if(map.containsKey(curr_Sum - tar)){
                cnt += map.get(curr_Sum - tar);
            }

            map.put(curr_Sum, map.getOrDefault(curr_Sum, 0) + 1);
        }

        return cnt;
    }
}