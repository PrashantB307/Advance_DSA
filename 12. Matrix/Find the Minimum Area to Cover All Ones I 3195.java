

//   https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/


class Solution {
    public int minimumArea(int[][] grid) {

        int minRow = Integer.MAX_VALUE;
        int maxRow = Integer.MIN_VALUE;
        int minCol = Integer.MAX_VALUE;
        int maxCol = Integer.MIN_VALUE;

        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        int h = maxRow - minRow + 1;
        int w = maxCol - minCol + 1;

        return h * w;
    }
}