

//   https://www.geeksforgeeks.org/problems/determinant-of-a-matrix-1587115620/1


class Solution
{
    //Function for finding determinant of matrix.
    static int determinantOfMatrix(int mat[][], int n)
    {
        if(n == 1){
            return mat[0][0];
        }
        if(n == 2){
            return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
        }

        int ans = 0;
        int sign = 1;

        for(int i = 0; i < n; i++){
            int[][] temp = new int[n - 1][n - 1];
            int row = 0;
            for(int col = 0; col < n; col++){
                if(col == i){
                    continue;
                }
                for(int k = 1; k < n; k++){
                    temp[k - 1][row] = mat[k][col];
                }
                row++;
            }

            ans += sign * mat[0][i] * determinantOfMatrix(temp, n - 1);
            sign = -sign;
        }

        return ans;
    }
}

