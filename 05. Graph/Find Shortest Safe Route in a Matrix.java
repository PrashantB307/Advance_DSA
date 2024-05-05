

//   https://www.geeksforgeeks.org/problems/find-shortest-safe-route-in-a-matrix/1


import java.util.*;
class Solution {
    static class Node {
        int first;
        int second;
        int third;

        public Node(int first, int second, int third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }

    public static int findShortestPath(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
      
        int[][] vis = new int[n][m];
       
        int[] delrow = { -1, 0, 0, 1 };
        int[] delcol = { 0, -1, 1, 0 };
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    vis[i][j] = -1;
                    for (int k = 0; k < 4; k++) {
                        int nrow = i + delrow[k];
                        int ncol = j + delcol[k];
                        if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m) {
                            vis[nrow][ncol] = -1;
                        }
                    }
                }
            }
        }

        Queue<Node> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (vis[i][0] == 0) {
                q.add(new Node(i, 0, 1));
                vis[i][0] = 1;
            }
        }

        while (!q.isEmpty()) {
            Node node = q.poll();
            int row = node.first;
            int col = node.second;
            int steps = node.third;
            for (int i = 0; i < 4; i++) {
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];
              
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0) {
                    q.add(new Node(nrow, ncol, steps + 1));
                    vis[nrow][ncol] = steps + 1;
                }
            }
        }

        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
    
            if (vis[i][m - 1] != 0 && vis[i][m - 1] != -1 && vis[i][m - 1] < mini) {
                mini = vis[i][m - 1];
            }
        }

        if (mini != Integer.MAX_VALUE) {
            return mini;
        }

        return -1;
    }
}
