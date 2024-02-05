

//   https://www.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1

//   https://www.codingninjas.com/studio/problems/ninja-and-matrix_4537652


import java.util.*;
class Solution {

    static ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    res.add(matrix[i][j]);
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    res.add(matrix[i][j]);
                }
            }
        }

        return res;
    }
}