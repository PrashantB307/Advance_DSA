

//   https://leetcode.com/problems/n-queens/

//   https://www.geeksforgeeks.org/problems/n-queen-problem0315/1


import java.util.*;
class Solution {

    List<List<String>> result;
    public List<List<String>> solveNQueens(int n) {
        result = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        List<int[]> queens = new ArrayList<>();
        dfs(board, 0, queens);
        
        return result;
    }

    private void dfs(char[][] board, int r, List<int[]> queens) {
    
        if (queens.size() == board.length) {
           
            List<String> rows = new ArrayList<>();
            for (char[] row : board) {
                rows.add(new String(row));
            }

            result.add(rows);
        }

        for (int c = 0; c < board.length; c++) {
            if (canAddQueen(r, c, queens)) {
                board[r][c] = 'Q';
                queens.add(new int[] { r, c });
                dfs(board, r + 1, queens);
                board[r][c] = '.';
                queens.remove(queens.size() - 1);
            }
        }
    }

    private boolean canAddQueen(int r, int c, List<int[]> queens) {
        for (int[] q : queens) {
            int dx = Math.abs(r - q[0]);
            int dy = Math.abs(c - q[1]);
            if (dx == 0 || dy == 0 || dx == dy)
                return false;
        }

        return true;
    }
}


//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX======>    GFG     <=========XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

class Solution2{
 
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        char[][] board = new char[n][n];

        solveQueen(ans, temp, board, 0);

        return ans;
    }

    private static void solveQueen(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> temp,
                                   char[][] board, int col) {
        if (col == board.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < board.length; i++) {
            board[i][col] = 'Q';
            if (canWePlaceQueen(board, i, col)) {
                temp.add(i + 1);
                solveQueen(ans, temp, board, (col + 1));
                temp.remove(Integer.valueOf(i + 1));
            }
            board[i][col] = ' ';
        }
    }

    private static boolean canWePlaceQueen(char[][] board, int row, int col) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 'Q') return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        for (int i = row + 1, j = col - 1; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }
}