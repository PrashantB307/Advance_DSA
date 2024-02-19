

//   https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/description/


import java.util.*;
class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 1; j < n; j++){
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        int cnt = 0;

        for(int c1 = 0; c1 < n; c1++){
            for(int c2 = c1; c2 < n; c2++){

                Map<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);
                int sum = 0;

                for(int r = 0; r < m; r++){
                    sum += matrix[r][c2] - (c1 > 0 ? matrix[r][c1 - 1] : 0);
                    cnt += map.getOrDefault(sum - target, 0);
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }

        return cnt;
    }
}