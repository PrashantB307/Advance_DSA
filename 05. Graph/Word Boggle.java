

//   https://www.geeksforgeeks.org/problems/word-boggle4143/1


import java.util.*;
class Solution {
    public String[] wordBoggle(char board[][], String[] dictionary) {
        List<String> ans = new ArrayList<>();
        int n = board.length;
        int m = board[0].length;

        for (String s : dictionary) {
            boolean flag = true;
            int[][] vis = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (board[i][j] == s.charAt(0) && vis[i][j] == 0 && solution(i, j, 1, board, s, vis)) {
                        ans.add(s);
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    break;
                }
            }
        }

        String[] str = new String[ans.size()];
        ans.toArray(str);
        return str;
    }

    public boolean solution(int i, int j, int k, char[][] board, String ssf, int[][] vis) {
        if (k == ssf.length()) {
            return true;
        }
        int n = board.length;
        int m = board[0].length;
        vis[i][j] = 1;
        int[] dx = { -1, -1, 0, 1, 1, 1, 0, -1 };
        int[] dy = { 0, 1, 1, 1, 0, -1, -1, -1 };

        for (int m1 = 0; m1 < 8; m1++) {
            int nr = i + dx[m1];
            int nc = j + dy[m1];

            if (nr >= 0 && nr < n && nc >= 0 && nc < m && vis[nr][nc] == 0 && board[nr][nc] == ssf.charAt(k)) {
                if (solution(nr, nc, k + 1, board, ssf, vis)) {
                    return true;
                }
            }
        }

        vis[i][j] = 0;
        return false;
    }
}