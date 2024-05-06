

//   https://www.geeksforgeeks.org/problems/minimum-cost-path3833/1


import java.util.*;
class Solution
{
    class Pair{
        int r;
        int c;
        int dist;

        Pair(int r, int c, int dist){
            this.r = r;
            this.c = c;
            this.dist = dist;
        }
    }

    public int minimumCostPath(int[][] grid){

        int m = grid.length;
        int n = grid[0].length;

        int[][] dist = new int[m][n];

        for(int i = 0; i < m; i++){
            Arrays.fill(dist, Integer.MAX_VALUE);
        }

        dist[0][0] = grid[0][0];

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);
        pq.add(new Pair(0, 0, dist[0][0]));

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        while (pq.size() > 0) {
            Pair curr = pq.remove();
            int r = curr.r;
            int c = curr.c;
            int d = curr.dist;

            for(int i = 0; i < 4; i++){
                int nr = r + dx[i];
                int nc = c + dy[i];

                if(nr >= 0 && nr < m && nc >= 0 && nc < n){
                    if(d + grid[nr][nc] < dist[nr][nc]){
                        dist[nr][nc] = d + grid[nr][nc];

                        pq.add(new Pair(nr, nc, dist[nr][nc]));
                    }
                }
            }
        }
    
        return dist[m - 1][n - 1];
    }
}