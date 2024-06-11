

//   https://www.geeksforgeeks.org/problems/largest-subsquare-surrounded-by-x0558/1


class Solution {
    int largestSubsquare(int n, char a[][]) {
        int[][] row = new int[n][n];
        int[][] col = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                row[i][j] = (a[i][j] == 'X' ? (j == 0 ? 1 :  row[i][j - 1] + 1) : 0);

                col[j][i] = (a[j][i] == 'X' ? (j == 0 ? 1 :  col[j - 1][i] + 1) : 0);
            }
        }

        int max = 0;
        for(int i = n - 1; i >= 0; i--){
            for(int j = n - 1; j >= 0; j--){
                int size = Math.min(row[i][j], col[i][j]);

                while (size > max) {
                    if(row[i - size + 1][j] >= size && col[i][j - size + 1] >= size){
                        max = size;
                        break;
                    }else{
                        size--;
                    }
                }
            }
        }

        return max;
    }
};