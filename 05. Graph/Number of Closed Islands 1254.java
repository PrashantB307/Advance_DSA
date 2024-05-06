

//    https://www.geeksforgeeks.org/problems/find-number-of-closed-islands/1

//    https://leetcode.com/problems/number-of-closed-islands/


class Solution
{
    boolean flag = true;
    public int closedIslands(int[][] matrix, int n, int m)
    {
        boolean[][] visited = new boolean[n][m];
        int cnt = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(visited[i][j] == false && matrix[i][j] == 1){
                    flag = true;
                    traverse(matrix, visited, n, m, i, j);
                    if(flag == true){
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }

    public void traverse(int[][] matrix, boolean[][] visited, int n, int m, int i, int j){
        if(i < 0 || j < 0 || i >= n || j >= m){ 
            flag = false;
            return;
        }else if(visited[i][j] == true || matrix[i][j] == 0){
            return;
        }
        

        visited[i][j] = true;

        traverse(matrix, visited, n, m, i, j + 1);
        traverse(matrix, visited, n, m, i + 1, j);
        traverse(matrix, visited, n, m, i, j - 1);
        traverse(matrix, visited, n, m, i - 1, j);
    }
}


//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX==========>    Leetcode    <==========XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2 {
    boolean flag = true;
    public int closedIsland(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean[][] visited = new boolean[n][m];
        int cnt = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(visited[i][j] == false && matrix[i][j] == 0){
                    flag = true;
                    traverse(matrix, visited, n, m, i, j);
                    if(flag == true){
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }

    public void traverse(int[][] matrix, boolean[][] visited, int n, int m, int i, int j){
        if(i < 0 || j < 0 || i >= n || j >= m){ 
            flag = false;
            return;
        }else if(visited[i][j] == true || matrix[i][j] == 1){
            return;
        }
        

        visited[i][j] = true;

        traverse(matrix, visited, n, m, i, j + 1);
        traverse(matrix, visited, n, m, i + 1, j);
        traverse(matrix, visited, n, m, i, j - 1);
        traverse(matrix, visited, n, m, i - 1, j);
    }
}