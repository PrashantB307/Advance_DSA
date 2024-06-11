

//   https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/


import java.util.*;
class Solution {
    public List<Integer> luckyNumbers(int[][] arr) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i][0];
            int psj = 0;
            
            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    psj = j;
                }
            }
            
            boolean issaddle = true;
            
            for (int ii = 0; ii < arr.length; ii++) {
                if (arr[ii][psj] > min) {
                    issaddle = false;
                    break;
                }
            }

            if (issaddle == true) {
               list.add(min);
            }
        }

        return list;
    }
}