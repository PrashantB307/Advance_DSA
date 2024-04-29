

//    https://leetcode.com/problems/distant-barcodes/


import java.util.*;
class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : barcodes){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (map.get(b) - map.get(a)));

        pq.addAll(map.keySet());

        int idx = 0;
        int[] ans = new int[barcodes.length];

        while (pq.size() > 0) {
            int key = pq.remove();
            int val = map.get(key);

            while (val-- > 0) {
                ans[idx] = key;
                idx += 2;

                if(idx >= ans.length){
                    idx = 1;
                }
            }
        }

        return ans;

    }
}