

//   https://leetcode.com/problems/right-triangles/


class Solution {
    public long numberOfRightTriangles(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int[] rowCnt = new int[m];
        int[] colCnt = new int[n];

        long ans = 0;

        for(int i = 0; i < m; i++){
            int cnt = 0;
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    cnt++;
                }
            }

            rowCnt[i] = cnt;
        }

        for(int j = 0; j < n; j++){
            int cnt = 0;
            for(int i = 0; i < m; i++){
                if(grid[i][j] == 1){
                    cnt++;
                }
            }

            colCnt[j] = cnt;
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    ans += (rowCnt[i] - 1) * (colCnt[j] - 1);
                }
            }
        }

        return ans;
    }
}