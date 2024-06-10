

//    https://www.geeksforgeeks.org/problems/exit-point-in-a-matrix0905/1


class Solution {
    public int[] FindExitPoint(int n, int m, int[][] matrix) {
        
        int[] ans = new int[2];
        int[] x = {0, 1, 0, -1};
        int[] y = {1, 0, -1, 0};

        int i = 0, j = 0, k = 0;

        while (i < n && i >= 0 && j < m && j >= 0) {
            if(matrix[i][j] == 1){
                matrix[i][j] = 0;
                k = (k + 1) % 4;
            }

            ans[0] = i;
            ans[1] = j;

            i = i + x[k];
            j = j + y[k];
        }

        return ans;
    }
}