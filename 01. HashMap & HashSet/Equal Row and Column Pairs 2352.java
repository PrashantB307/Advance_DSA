

//    https://leetcode.com/problems/equal-row-and-column-pairs/


import java.util.*;
class Solution {
    public int equalPairs(int[][] grid) {
        
        HashMap<Integer, ArrayList<Integer>> row = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> col = new HashMap<>();

        for(int i = 0; i < grid.length; i++){
            row.put(i, new ArrayList<>());
        }

        for(int i = 0; i < grid.length; i++){
            col.put(i, new ArrayList<>());
        }

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                row.get(i).add(grid[i][j]);
                col.get(j).add(grid[i][j]);
            }
        }

        int ans = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(row.get(i).equals(col.get(j))){
                    ans++;
                }
            }
        }

        return ans;

    }
}