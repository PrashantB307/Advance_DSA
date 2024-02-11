

//    https://leetcode.com/problems/find-score-of-an-array-after-marking-all-elements/


import java.util.*;
class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
        long score = 0;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]
        );

        for(int i = 0; i < n; i++){
            pq.add(new int[] {i, nums[i]});
        }

        HashSet<Integer> set = new HashSet<>();
        while (pq.size() > 0) {
            int[] val = pq.poll();

            if(set.contains(val[0])){
                continue;
            }else{
                score += val[1];
                set.add(val[0]);
                set.add(val[0] + 1);
                set.add(val[0] - 1);
            }
        }

        return score;
    }
}