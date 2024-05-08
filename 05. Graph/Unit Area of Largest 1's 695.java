

//    https://leetcode.com/problems/max-area-of-island/

//    https://www.geeksforgeeks.org/problems/length-of-largest-region-of-1s-1587115620/1


class Solution {
    int len = 0;
    public int maxAreaOfIsland(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        int max = 0;
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    len = 0;
                    traverse(grid, visited, i, j);
                    max = Math.max(max, len);
                }
            }
        }

        return max;
    }

    public void traverse(int[][] grid, boolean[][] visited, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || visited[i][j] == true){
            return;
        }

        visited[i][j] = true;
        len++;

        traverse(grid, visited, i + 1, j);
        traverse(grid, visited, i - 1, j);
        traverse(grid, visited, i, j + 1);
        traverse(grid, visited, i, j - 1);

        //  Gor GFG (8 Directions)====>
        
        // traverse(grid, visited, i + 1, j + 1);
        // traverse(grid, visited, i - 1, j - 1);
        // traverse(grid, visited, i - 1, j + 1);
        // traverse(grid, visited, i + 1, j - 1);
    }
}