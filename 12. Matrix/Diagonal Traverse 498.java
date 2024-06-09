

//    https://leetcode.com/problems/diagonal-traverse/

//    https://www.geeksforgeeks.org/problems/print-matrix-in-diagonal-pattern/1


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length == 0 || mat[0].length == 0){
            return new int[0];
        }

        int n = mat.length;
        int m = mat[0].length;
        int[] arr = new int[n * m];
        int row = 0;
        int col = 0;
        int i = 0;

        boolean up = true;

        while (row < n && col < m) {
            if(up){
                while (row > 0 && col < m - 1) {
                    arr[i++] = mat[row][col];
                    row--;
                    col++;
                }
                arr[i++] = mat[row][col];
                if(col == m - 1){
                    row++;
                }else{
                    col++;
                }
            }else{
                while (col > 0 && row < n - 1) {
                    arr[i++] = mat[row][col];
                    row++;
                    col--;
                }
                arr[i++] = mat[row][col];
                if(row == n - 1){
                    col++;
                }else{
                    row++;
                }
            }
            up = !up;
        }

        return arr;
    }
}