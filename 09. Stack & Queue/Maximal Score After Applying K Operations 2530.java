

//   https://leetcode.com/problems/maximal-score-after-applying-k-operations/


import java.util.*;
class Solution {
    public long maxKelements(int[] nums, int k) {
        long ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int val : nums){
            pq.add(val);
        }

        while (k-- > 0) {
            int val = pq.poll();
            ans += val;
            pq.add((int)Math.ceil(val / 3.0));
        }

        return ans;
    }
}