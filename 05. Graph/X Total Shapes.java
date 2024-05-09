

//   https://www.geeksforgeeks.org/problems/x-total-shapes3617/1


class Solution {
    public int xShape(char[][] grid) {
       
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        int cnt = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 'X' && visited[i][j] == false){
                    cnt++;
                    traverse(grid, visited, i, j);
                }
            }
        }

        return cnt;
    }

    public void traverse(char[][] grid, boolean[][] visited, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 'X' || visited[i][j] == true){
            return;
        }

        visited[i][j] = true;

        traverse(grid, visited, i - 1, j);
        traverse(grid, visited, i + 1, j);
        traverse(grid, visited, i, j - 1);
        traverse(grid, visited, i, j + 1);
    } 
}