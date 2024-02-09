

//    https://leetcode.com/problems/k-diff-pairs-in-an-array/

//    https://www.geeksforgeeks.org/problems/count-distinct-pairs-with-difference-k1233/1


import java.util.*;
class Solution {
    public int findPairs(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : nums){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        int cnt = 0;

        for(int key : map.keySet()){
            if(k == 0 && map.get(key) > 1){
                cnt++;
            }else if(k > 0 && map.containsKey(key - k)){
                cnt++;
            }
        }

        return cnt;
    }
}