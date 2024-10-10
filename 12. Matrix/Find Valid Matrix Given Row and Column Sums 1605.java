

//   https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums/


class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        
        int m = rowSum.length;
        int n = colSum.length;
        int[][] arr = new int[m][n];

        int i = 0, j = 0;

        while(i < m && j < n){
            int val = Math.min(rowSum[i], colSum[j]);
            arr[i][j] = val;
            rowSum[i] -= val;
            colSum[j] -= val;

            if(rowSum[i] == 0){
                i++;   
            }
            if(colSum[j] == 0){
                j++;
            }
        }

        return arr;
    }
}