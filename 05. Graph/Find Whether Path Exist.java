

//    https://www.geeksforgeeks.org/problems/find-whether-path-exist5238/1


class Solution
{
    boolean flag = false;
    public boolean is_Possible(int[][] grid)
    {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    travers(grid, i , j, visited);
                }
            }
        }

        return flag;
    }

    void travers(int[][] grid, int i, int j, boolean[][] visited){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid.length || grid[i][j] == 0 || visited[i][j] == true){
            return;
        }

        if(grid[i][j] == 2){
            flag = true;
            return;
        }

        visited[i][j] = true;
        travers(grid, i - 1, j, visited);
        travers(grid, i, j + 1, visited);
        travers(grid, i + 1, j, visited);
        travers(grid, i, j - 1, visited);
    }
}