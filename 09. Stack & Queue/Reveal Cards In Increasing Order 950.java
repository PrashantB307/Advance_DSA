

//   https://leetcode.com/problems/reveal-cards-in-increasing-order/

import java.util.*;
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck); 
        
        int n = deck.length;
        int[] res = new int[n];
        Deque<Integer> dq = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            dq.add(i); 
        }

        for(int val : deck){
            int idx = dq.remove();
            res[idx] = val;

            if(!dq.isEmpty()){
                dq.add(dq.remove());
            }
        }

        return res;
    }
}