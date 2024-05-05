

//   https://www.geeksforgeeks.org/problems/geek-in-a-maze--170637/1


import java.util.*;
class Solution {
    static int cnt = 0;

    public static int numberOfCells(int n, int m, int r, int c, int u, int d, char mat[][]) {
        if (mat[r][c] == '#') {
            return 0;
        }

        mat[r][c] = '#';
        cnt = 1;

        helper(r, c, n, m, u, d, mat);

        return cnt;
    }

    public static void helper(int x, int y, int n, int m, int u, int d, char mat[][]) {

        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[] { x, y, u, d });

        while (q.size() > 0) {
            int[] curr = q.remove();
            x = curr[0];
            y = curr[1];
            u = curr[2];
            d = curr[3];

            if (y - 1 >= 0 && mat[x][y - 1] == '.') {
                mat[x][y - 1] = '#';
                cnt++;
                q.add(new int[] { x, y - 1, u, d });
            }

            if (y + 1 < m && mat[x][y + 1] == '.') {
                mat[x][y + 1] = '#';
                cnt++;
                q.add(new int[] { x, y + 1, u, d });
            }
            
            if (x - 1 >= 0 && mat[x - 1][y] == '.' && u > 0) {
                mat[x - 1][y] = '#';
                cnt++;
                q.add(new int[] { x - 1, y, u - 1, d });
            }
            
            if (x + 1 < n && mat[x + 1][y] == '.' && d > 0) {
                mat[x + 1][y] = '#';
                cnt++;
                q.add(new int[] { x + 1, y, u, d - 1 });
            }
        }
    }
}