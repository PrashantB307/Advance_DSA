

//    https://practice.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1


import java.util.*;
class Solution {
    int median(int matrix[][], int R, int C) {
        int[] med = new int[R * C];
        int index = 0;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                med[index] = matrix[i][j];
                index++;
            }
        }

        Arrays.sort(med);
        return med[(R * C) / 2];
    }
}