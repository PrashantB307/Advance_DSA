

//   https://leetcode.com/problems/valid-sudoku/description/

//   https://www.geeksforgeeks.org/problems/is-sudoku-valid4820/1

//   https://www.codingninjas.com/studio/problems/sudoku_758961?leftPanelTabValue=PROBLEM


import java.util.*;
class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (set.contains("row" + i + board[i][j]) ||
                            set.contains("col" + j + board[i][j]) ||
                            set.contains("box" + (i / 3) * 3 + (j / 3) + board[i][j])) {
                        return false;
                    } else {
                        set.add("row" + i + board[i][j]);
                        set.add("col" + j + board[i][j]);
                        set.add("box" + (i / 3) * 3 + (j / 3) + board[i][j]);
                    }
                }
            }
        }

        return true;
    }
}