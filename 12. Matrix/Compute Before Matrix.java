

//   https://www.geeksforgeeks.org/problems/compute-before-matrix--170637/1


class Solution{
    public int[][] computeBeforeMatrix(int n, int m, int[][] mat ){
        
        for(int i = n - 1; i >= 0; i--){
            for(int j = m - 1; j >= 0; j--){
                if(i == 0 && j > 0){
                    mat[i][j] -= mat[i][j - 1];
                }else if(i > 0 && j == 0){
                    mat[i][j] -= mat[i - 1][j];
                }else if(i > 0 && j > 0){
                    mat[i][j] -= mat[i - 1][j] + mat[i][j - 1] - mat[i - 1][j - 1];
                }
            }
        }

        return mat;
    }
}