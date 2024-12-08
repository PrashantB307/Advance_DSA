

//   https://leetcode.com/problems/find-champion-ii/


import java.util.*;
class Solution {
    public int findChampion(int n, int[][] edges) {
        
        boolean[] loser = new boolean[n];
        Arrays.fill(loser, true);

        for(int[] edge : edges){
            // int win = edge[0];
            int lose = edge[1];

            loser[lose] = false;
        }

        int champ = -1;
        int cnt = 0;

        for(int i = 0; i < n; i++){
            if(loser[i]){
                champ = i;
                cnt++;
            }
        }

        return cnt == 1 ? champ : -1;
    }
}