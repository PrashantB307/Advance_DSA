

//   https://leetcode.com/problems/find-center-of-star-graph/


import java.util.*;
class Solution {
    public int findCenter(int[][] edges) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int[] edge : edges){
            int val1 = edge[0];
            int val2 = edge[1];

            map.put(val1, map.getOrDefault(val1, 0) + 1);
            map.put(val2, map.getOrDefault(val2, 0) + 1);
        }

        for(int val : map.keySet()){
            if(map.get(val) == edges.length){
                return val;
            }
        }

        return -1;
    }
}