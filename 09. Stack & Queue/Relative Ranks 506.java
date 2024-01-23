

//    https://leetcode.com/problems/relative-ranks/description/


import java.util.*;
class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        int n = score.length;
        String[] ans = new String[n];

        HashMap<Integer, String> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int val : score){
            pq.add(val);
        }

        map.put(pq.poll(), "Gold Medal");
        map.put(pq.poll(), "Silver Medal");
        map.put(pq.poll(), "Bronze Medal");

        for(int i = 4; i <= n; i++){
            int val = pq.poll();
            map.put(val, i + "");
        }

        for(int i = 0; i < n; i++){
            int val = score[i];
            ans[i] = map.get(val);
        }

        return ans;
    }
}