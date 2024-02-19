

//   https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1

//   https://www.codingninjas.com/studio/problems/occurrence-of-x-in-a-sorted-array_630456


import java.util.*;
class Solution {
    int count(int[] arr, int n, int x) {
       HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int val = 0;
        if(map.containsKey(x)){
            val = map.get(x);
        }

        return val;
    }
}