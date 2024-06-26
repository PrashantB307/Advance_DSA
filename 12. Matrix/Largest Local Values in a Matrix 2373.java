

//   https://leetcode.com/problems/largest-local-values-in-a-matrix/


class Solution {
    public int[][] largestLocal(int[][] grid) {
        
        int n = grid.length;

        int[][] ans = new int[n - 2][n - 2];

        for(int i = 0; i < n - 2; i++){
            for(int j = 0; j < n - 2; j++){

                int temp = 0;
                for(int k = i; k <= i + 2; k++){
                    for(int l = j; l <= j + 2; l++){
                        temp = Math.max(temp, grid[k][l]);
                    }
                }

                ans[i][j] = temp;
            }
        }

        return ans;
    }
}