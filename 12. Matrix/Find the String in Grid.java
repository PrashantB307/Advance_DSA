

//    https://www.geeksforgeeks.org/problems/find-the-string-in-grid0111/1


import java.util.*;
class Solution
{
    int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
    int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };

    public int[][] searchWord(char[][] grid, String word)
    {
        int m = grid.length;
        int n = grid[0].length;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == word.charAt(0) && find(grid, i, j, word)){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);

                    res.add(list);
                }
            }
        }

        if(res.size() > 0){
            int[][] ans = new int[res.size()][2];

            for(int i = 0; i < res.size(); i++){
                ans[i][0] = res.get(i).get(0);
                ans[i][1] = res.get(i).get(1);
            }

            return ans;
        }

        return new int[0][0];
    }

    boolean find(char[][] grid, int i, int j, String word){
        int len = word.length();

        for(int d = 0; d < 8; d++){
            int nr = i + dx[d];
            int nc = j + dy[d];

            int k = 1;

            for(k = 1; k < len; k++){
                if(nr < 0 || nc < 0 || nr >= grid.length || nc >= grid[0].length){
                    break;
                }

                if(grid[nr][nc] != word.charAt(k)){
                    break;
                }
                
                nr += dx[d];
                nc += dy[d];
            }

            if(k == len){
                return true;
            }
        }

        return false;
    }
}