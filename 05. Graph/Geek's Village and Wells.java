

//    https://www.geeksforgeeks.org/problems/geeks-village-and-wells--170647/1


import java.util.*;
class Pair{
    int i, j, d;
    Pair(int i, int j, int d){
        this.i = i;
        this.j = j;
        this.d = d;
    }
}

class Solution
{
    public int[][] chefAndWells(int n, int m, char grid[][])
    {
        boolean[][] visited = new boolean[n][m];
         Queue<Pair> q = new LinkedList<Pair>();
        
        
        int[][] ans = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 'W'){
                    q.add(new Pair(i, j, 0));
                    visited[i][j] = true;
                }
            }
        }

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        while (q.size() > 0) {
            int row = q.peek().i;
            int col = q.peek().j;
            int dis = q.peek().d;
            q.remove();

            if(grid[row][col] == 'H'){
                ans[row][col] = 2 * dis;
            }

            for(int i = 0; i < 4; i++){
                int nrow = row + dx[i];
                int ncol = col + dy[i];

                if(nrow >= 0 && ncol >= 0 && nrow < n && ncol < m && !visited[nrow][ncol] && (grid[nrow][ncol] == 'H' || grid[nrow][ncol] == '.')){
                    visited[nrow][ncol] = true;
                    q.add(new Pair(nrow, ncol, dis + 1));
                }
            }
        }

        for(int ii = 0; ii < n; ii++){
            for(int jj = 0; jj < m; jj++){
                if(!visited[ii][jj] && grid[ii][jj] == 'H'){
                    ans[ii][jj] = -1;
                }
            }
        }

        return ans;
    }

}