

//   https://leetcode.com/problems/matrix-block-sum/


class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        
        int n = mat.length;
        int m = mat[0].length;
        int[][] ans = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                for(int x = -k; x <= k; x++){
                    if(i + x >= 0 && i + x < n){
                        int l = Math.max(j - k, 0);
                        int r = j + k + 1;
                        ans[i + x][l] += mat[i][j];
                        
                        if(r < m){
                            ans[i + x][r] -= mat[i][j];
                        }
                    }
                }
            }
        }

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = 0;
            for(int j = 0; j < m; j++){
                sum += ans[i][j];
                ans[i][j] = sum;
            }
        }

        return ans;
    }
}