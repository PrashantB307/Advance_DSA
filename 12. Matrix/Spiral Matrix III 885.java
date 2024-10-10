

//   https://leetcode.com/problems/spiral-matrix-iii/


import java.util.*;
class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int r, int c) {
        int[][] dir = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int steps = 1;
        int totalCells = rows * cols;
        
        List<int[]> result = new ArrayList<>();
        int d = 0;

        while (result.size() < totalCells) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < steps; j++) {
                    if (0 <= r && r < rows && 0 <= c && c < cols) {
                        result.add(new int[] { r, c });
                    }

                    if (result.size() == totalCells) {
                        return convertListToArray(result);
                    }

                    r += dir[d][0];
                    c += dir[d][1];
                }

                d = (d + 1) % 4;
            }

            steps++;
        }

        return convertListToArray(result);
    }

    public int[][] convertListToArray(List<int[]> list) {
        int[][] array = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }
}