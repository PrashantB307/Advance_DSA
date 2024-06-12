

//   https://leetcode.com/problems/shift-2d-grid/


import java.util.*;
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        List<List<Integer>> res = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;

        int total = m * n;
        k = k % total;

        for(int i = 0; i < m; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < n; j++){

                int idx = ((i * n + j) - k + total) % total;
                list.add(grid[idx / n][idx % n]);
            }

            res.add(list);
        }

        return res;
    }
}