

//    https://www.geeksforgeeks.org/problems/spidey-sense5556/1


import java.util.*;
class Solution
{
    static class Pair{
        int i, j;
        Pair(int i, int j){
            this.i = i;
            this.j = j;
        } 
    }

    public static int[][] findDistance(char mat[][], int m,int n)
    {
        int[][] ans = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 'W'){
                    ans[i][j] = -1;
                }else if(mat[i][j] == 'B'){
                    ans[i][j] = 0;
                }else{
                    ans[i][j] = -1;
                }
            }
        }

        Queue<Pair> q = new ArrayDeque<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j]=='B'){
                    q.add(new Pair(i,j));
                }
            }
        }

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        while (q.size() > 0){
            Pair rem = q.remove();
            int ni = rem.i;
            int nj = rem.j;

            for(int k = 0; k < 4; k++){
                int nr = ni + dx[k];
                int nc = nj + dy[k];

                if(nr >= 0 && nc >= 0 && nr < m && nc < n && mat[nr][nc] == 'O'){
                    if(ans[nr][nc] == -1){
                        q.add(new Pair(nr, nc));
                        ans[nr][nc] = ans[ni][nj] + 1;
                    }
                }
            }
        }

        return ans;

    }
}