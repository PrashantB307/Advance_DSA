

//   https://www.geeksforgeeks.org/problems/top-k-frequent-elements-in-array/1

//   https://leetcode.com/problems/top-k-frequent-elements/description/


import java.util.*;
class Solution {
    public int[] topK(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : nums){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            if(map.get(a) - map.get(b) == 0){
                return b - a;
            }else {
                return map.get(b) - map.get(a);
            }
        });
        
        
        for(int val : map.keySet()){
            pq.add(val);
        }
        
        int []ans = new int[k];
        int idx = 0;
        
        while(!pq.isEmpty() && idx < k){
            ans[idx++] = pq.remove();
        }
        return ans;
        
    }
}