

//    https://leetcode.com/problems/shortest-path-in-binary-matrix/


import java.util.*;
class Pair {
    int d, i, j;

    Pair(int a, int b, int c) {
        d = a;
        i = b;
        j = c;
    }
}

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] != 0) {
            return -1;
        }
        Queue<Pair> q = new LinkedList<>();
        if (grid.length == 1) {
            return 1;
        }

        int[][] vis = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                vis[i][j] = Integer.MAX_VALUE;
            }
        }
        vis[0][0] = 0;

        q.add(new Pair(0, 0, 0));
        int[] dr = { -1, -1, -1, 0, 1, 1, 1, 0 };
        int[] dc = { -1, 0, 1, 1, 1, 0, -1, -1 };
      
        while (!q.isEmpty()) {
            Pair rem = q.poll();

            int dis = rem.d;
            int r = rem.i;
            int c = rem.j;
            
            for (int i = 0; i < 8; i++) {
                int newr = r + dr[i];
                int newc = c + dc[i];
                
                if (newr >= 0 && newr < n && newc >= 0 && newc < n && grid[newr][newc] == 0
                        && dis + 1 < vis[newr][newc]) {
                    vis[newr][newc] = dis + 1;
                    if (newr == n - 1 && newc == n - 1) {
                        return dis + 2;

                    }

                    q.add(new Pair(dis + 1, newr, newc));
                }
            }
        }

        return -1;

    }
}