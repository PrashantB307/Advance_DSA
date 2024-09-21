

//    https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/


import java.util.*;
class Solution {
    public boolean checkValid(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int j = 0; j < matrix[0].length; j++) {
                if (hm.containsKey(matrix[i][j])) {
                    return false;
                } else {
                    hm.put(matrix[i][j], 1);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int j = 0; j < matrix[0].length; j++) {
                if (hm.containsKey(matrix[j][i])) {
                    return false;
                } else {
                    hm.put(matrix[j][i], 1);
                }
            }
        }

        return true;
    }
}