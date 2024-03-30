

//   https://leetcode.com/problems/task-scheduler/


import java.util.*;
class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int[] freq = new int[26];
        for(int i = 0; i < tasks.length; i++){
            freq[tasks[i] - 'A']++;
        }

        Arrays.sort(freq);

        int maxFrq = freq[25];
        int idle = (maxFrq - 1) * n;

        for(int i = 24; i >= 0; i--){
            idle -= Math.min(maxFrq - 1, freq[i]);
        }

        idle = Math.max(0, idle);

        return tasks.length + idle;
    }
}