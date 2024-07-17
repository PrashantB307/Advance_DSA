

//    https://www.geeksforgeeks.org/problems/path-with-minimum-effort/1

//    https://leetcode.com/problems/path-with-minimum-effort/


import java.util.*;
class Solution {

    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, 1, 0, -1 };

    public static int MinimumEffort(int row, int col, int[][] heights) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        boolean[][] visited = new boolean[row][col];
        pq.add(new int[] { 0, 0, 0 });

        while (pq.size() > 0) {
            int[] curr = pq.poll();
            int x = curr[0];
            int y = curr[1];
            int effort = curr[2];

            if (x == row - 1 && y == col - 1) {
                return effort;
            }

            visited[x][y] = true;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < row && ny >= 0 && ny < col && !visited[nx][ny]) {
                    int diff = Math.abs(heights[x][y] - heights[nx][ny]);
                    int maxDiff = Math.max(diff, effort);

                    pq.offer(new int[] { nx, ny, maxDiff });
                }
            }
        }

        return -1;
    }
}