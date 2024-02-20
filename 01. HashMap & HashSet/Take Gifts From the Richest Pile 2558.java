

//    https://leetcode.com/problems/take-gifts-from-the-richest-pile/


import java.util.*;
class Solution {
    public long pickGifts(int[] gifts, int k) {

        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int val : gifts){
            pq.add(val);
        }

        long ans = 0;
        while(k-- > 0){
            int val = (int)Math.sqrt(pq.poll());
            pq.add(val);
        }

        while(pq.size() > 0){
            ans += pq.poll();
        }

        return ans;
    }
}