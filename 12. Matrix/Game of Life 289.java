

//   https://leetcode.com/problems/game-of-life/


class Solution {
    public void gameOfLife(int[][] board) {
        
        int m = board.length;
        int n = board[0].length;
        int[][] dir = new int[][]{{-1, 0}, {-1, 1}, {0, 1}, {1, 1},{1, 0}, {1, -1}, {0, -1}, {-1, -1}};

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int cnt = 0;

                for(int[] d : dir){
                    int ni = i + d[0];
                    int nj = j + d[1];

                    if(ni >= 0 && ni < m && nj >= 0 && nj < n && (board[ni][nj] == 1 || board[ni][nj] == 2)){
                        cnt++;
                    }
                }

                if(board[i][j] == 1){
                    if(cnt < 2 || cnt > 3){
                        board[i][j] = 2;
                    }
                }else{
                    if(cnt == 3){
                        board[i][j] = 3;
                    }
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                board[i][j] %= 2;
            }
        }
    }
}