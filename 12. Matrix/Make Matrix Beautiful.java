

//    https://www.geeksforgeeks.org/problems/make-matrix-beautiful-1587115620/1


class Solution {
    public static int findMinOperation(int N, int[][] matrix) {
        
        int n = matrix.length;
        int[] row = new int[n];
        int[] col = new int[n];

        int max = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                row[i] += matrix[i][j];
                max = Integer.max(max, row[i]);

                col[j] += matrix[i][j];
                max = Integer.max(max, col[j]);
            }
        }

        int res = 0;
        for(int i = 0; i < n; i++){
            row[i] = max - row[i];
            res += row[i];
        }

        return res;
        
    }
}
        
