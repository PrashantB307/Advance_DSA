

//    https://www.geeksforgeeks.org/problems/fill-the-matrix--170647/


import java.util.*;
class Solution
{
    static class Pair{
        int i, j, level;
        Pair(int i, int j, int level){
            this.i = i;
            this.j = j;
            this.level = level;
        }
    }

	public static int minIteration(int N, int M, int x, int y){
		boolean[][] visited = new boolean[N][M];
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(x - 1, y - 1, 0));

        visited[x - 1][y - 1] = true;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int lev = 0;

        while (q.size() > 0) {
            Pair rem = q.peek();
            int ni = rem.i;
            int nj = rem.j;
            lev = rem.level;
            q.remove();

            for(int i = 0; i < 4; i++){
                int nx = ni + dx[i];
                int ny = nj + dy[i];

                if(nx >= 0 && ny >= 0 && nx < N && ny < M && visited[nx][ny] == false){
                    visited[nx][ny] = true;
                    q.add(new Pair(nx, ny, lev + 1));
                }
            }
        }
        
		return lev;
	}
}