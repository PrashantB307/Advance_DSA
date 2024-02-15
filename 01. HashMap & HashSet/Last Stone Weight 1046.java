

//    https://leetcode.com/problems/last-stone-weight/

//    https://www.codingninjas.com/studio/problems/last-stone-weight_630419


import java.util.*;
class Solution {
    public int lastStoneWeight(int[] stones) {
     
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        if(stones.length == 1){
            return stones[0];
        }

        for(int val : stones){
            pq.add(val);
        }
        while (pq.size() > 1) {
            int v1 = pq.remove();
            int v2 = pq.remove();

            if(v1 != v2){
                pq.add(v1 - v2);
            }
        }

        if(pq.size() == 0){
            return 0;
        }

        return pq.poll();
    }
}