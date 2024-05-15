

//   https://leetcode.com/problems/two-city-scheduling/submissions/1220329341/


import java.util.*;
class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b) -> ((a[0] - a[1]) - (b[0] - b[1])));

        int minCost = 0;
        int n = costs.length;

        for (int i = 0; i < costs.length; i++) {
            if (i < n / 2){
                minCost += costs[i][0];
            }else{
                minCost += costs[i][1];
            }
        }

        return minCost;
    }
}