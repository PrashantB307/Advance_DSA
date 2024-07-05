

//   https://www.geeksforgeeks.org/problems/left-rotate-matrix-k-times2351/1


class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {
        
        int m = mat.length;
        int n = mat[0].length;

        int[][] arr = new int[m][n];
        k = k % n;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = mat[i][(j + k) % n];
            }
        }

        return arr;
    }
}