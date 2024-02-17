

//    https://leetcode.com/problems/mice-and-cheese/


import java.util.*;
class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        
        int n = reward1.length;
        int sum = 0;

        for(int val : reward2){
            sum += val;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n ; i++){
            pq.add(reward1[i] - reward2[i]);
        }

        while (k-- > 0) {
            sum += pq.poll();
        }
        
        return sum;
    }
}