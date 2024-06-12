

//    https://leetcode.com/problems/score-after-flipping-matrix/

//    https://www.naukri.com/code360/problems/scope-after-flipping-matrix_1404662


class Solution {
    public int matrixScore(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        int ans = n * (1 << (m - 1));

        for(int j = 1; j < m; j++){
            int colCnt =  0;
            for(int i = 0; i < n; i++){
                colCnt += grid[i][0] == 0 ? (grid[i][j] ^ 1) : grid[i][j];
            }

            if(colCnt < n - colCnt){
                ans += (n - colCnt) * (1 << (m - 1 - j));
            }else{
                ans += (colCnt) * (1 << (m - 1 - j));
            }
        }

        return ans;

    }
}