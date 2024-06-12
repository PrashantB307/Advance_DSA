

//   https://leetcode.com/problems/spiral-matrix-ii/description/


class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] mat = new int[n][n];

        int cnt = 1;
        int left = 0, right = n - 1, top = 0, bottom = n - 1;

        while (top <= bottom && left <= right) {
            
            for(int i = left; i <= right; i++){
                mat[top][i] = cnt++;
            }
            top++;

            for(int i = top; i <= bottom; i++){
                mat[i][right] = cnt++;
            }
            right--;

            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    mat[bottom][i] = cnt++;
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    mat[i][left] = cnt++;
                }
                left++;
            }
        }

        return mat;
    }
}