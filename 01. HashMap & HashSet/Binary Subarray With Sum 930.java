

//    https://practice.geeksforgeeks.org/problems/binary-subarray-with-sum/1

//    https://leetcode.com/problems/binary-subarrays-with-sum/


import java.util.*;
class Solution
{
    int numberOfSubarrays(int arr[], int N, int tar){
       
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int ans = 0;
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum += arr[i];
            int rem = sum - tar;

            if(map.containsKey(rem)){
                ans += map.get(rem);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return ans;
    }
}