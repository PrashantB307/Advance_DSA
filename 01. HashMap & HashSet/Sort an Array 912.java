

//   https://leetcode.com/problems/sort-an-array/


import java.util.*;
class Solution {
    public int[] sortArray(int[] nums) {
        
        int[] ans = new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int val : nums){
            pq.add(val);
        }

        int i = 0;
        while(pq.size() > 0){
            ans[i++] = pq.poll();
        }

        return ans;
    }
}