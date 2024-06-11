

//   https://leetcode.com/problems/magic-squares-in-grid/

//   https://www.codingninjas.com/studio/problems/magic-squares-in-matrix_3146846


class Solution {
    public int numMagicSquaresInside(int[][] grid) {

        if (grid.length < 3 && grid[0].length < 3) {
            return 0;
        }

        int cnt = 0;
        for (int i = 0; i <= grid.length - 3; i++) {
            for (int j = 0; j <= grid[0].length - 3; j++) {
                if (isMagicSquare(grid, i, j)) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    boolean isMagicSquare(int[][] grid, int i, int j) {
        if (grid[i + 1][j + 1] != 5) {
            return false;
        }

        if (grid[i][j] % 2 != 0 || grid[i + 2][j] % 2 != 0 || grid[i][j + 2] % 2 != 0 || grid[i + 2][j + 2] % 2 != 0) {
            return false;
        }

        if (grid[i + 1][j] % 2 == 0 || grid[i][j + 1] % 2 == 0 || grid[i + 1][j + 2] % 2 == 0
                || grid[i + 2][j + 1] % 2 == 0) {
            return false;
        }

        if ((grid[i][j] + grid[i][j + 1] + grid[i][j + 2]) != 15 ||
                (grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2]) != 15 ||
                (grid[i][j] + grid[i + 1][j] + grid[i + 2][j]) != 15) {
            return false;
        }
        return true;
    }
}