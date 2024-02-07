

//   https://leetcode.com/problems/matrix-diagonal-sum/


class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    sum += mat[i][j];
                }

                if(i + j == n - 1){
                    sum += mat[i][j];
                }
            }
        }

        if(mat.length % 2 == 1){
            int i = n / 2;
            sum -= mat[i][i];

        }

        return sum;
    }
}