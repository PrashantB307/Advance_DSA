

//   https://leetcode.com/problems/find-the-first-player-to-win-k-games-in-a-row/


import java.util.*;
class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        int n = skills.length;

        if (k >= n) {
            int max = skills[0];
            int idx = 0;

            for (int i = 1; i < n; i++) {
                if (skills[i] > max) {
                    max = skills[i];
                    idx = i;
                }
            }

            return idx;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(i);
        }

        int curr = q.poll();
        int wins = 0;

        while (wins < k) {
            int next = q.poll();

            if (skills[curr] > skills[next]) {
                wins++;
                q.offer(next);

            } else {
                wins = 1;
                q.offer(curr);
                curr = next;
            }
        }

        return curr;
    }
}