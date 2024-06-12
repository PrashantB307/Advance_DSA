

//   https://www.geeksforgeeks.org/problems/row-with-minimum-number-of-1s5430/1


class Solution {
    int minRow(int n, int m, int a[][]) {
        
        int idx = -1;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            int cnt = 0;
            for(int j = 0; j < m; j++){
                if(a[i][j] == 1){
                    cnt++;
                }
            }

            if(cnt < min){
                min = cnt;
                idx = i + 1;
            }
        }

        return idx;
    }
};