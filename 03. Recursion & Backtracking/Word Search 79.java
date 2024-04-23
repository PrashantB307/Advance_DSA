

//   https://leetcode.com/problems/word-search/ 

//   https://www.geeksforgeeks.org/problems/word-search/1


class Solution {
    
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        
        visited = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    if(findWord(board, word, i, j, 0)){
                        return true;
                    }
                }
            }
        }
        
        return false;
    }

    boolean findWord(char[][] board, String word, int i, int j, int idx){

        if(idx == word.length()){
            return true;
        }

        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(idx) || visited[i][j] == true){
            return false;
        }

      
        visited[i][j] = true;

        boolean up = findWord(board, word, i - 1, j, idx + 1);
        boolean right = findWord(board, word, i, j + 1, idx + 1);
        boolean down = findWord(board, word, i + 1, j, idx + 1);
        boolean left = findWord(board, word, i, j - 1, idx + 1);

        visited[i][j] = false;

        return up || down || left || right;
    }

}