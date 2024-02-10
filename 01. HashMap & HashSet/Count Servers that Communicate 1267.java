

//   https://leetcode.com/problems/count-servers-that-communicate/description/


import java.util.*;
class Solution {
    public int countServers(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        HashMap<Integer, Integer> rowmap = new HashMap<>();
        HashMap<Integer, Integer> colmap = new HashMap<>();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    rowmap.put(i, rowmap.getOrDefault(i, 0) + 1);
                    colmap.put(j, colmap.getOrDefault(j, 0) + 1);
                }
            }
        }

        int cnt = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1 && (rowmap.get(i) > 1 || colmap.get(j) > 1)){
                    cnt++;
                }
            }
        }

        return cnt;
    }
}