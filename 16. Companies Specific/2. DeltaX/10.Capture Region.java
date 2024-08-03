

//    https://www.naukri.com/code360/problems/capture-region_1092608

//    https://leetcode.com/problems/surrounded-regions/


class Solution {
    public static char[][] captureRegion(char[][] mat, int n, int m) {
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if((i == 0 || i == n - 1 || j == 0 || j == m - 1) && mat[i][j] == 'O'){
                    traverse(mat, i, j);
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] != 'K'){
                    mat[i][j] = 'X';
                }else{
                    mat[i][j] = 'O';
                }
            }
        }
    
        return mat;
    }

    public static void traverse(char[][] mat, int i, int j){
        if(i < 0 || i >= mat.length || j < 0 || j >= mat[0].length || mat[i][j] != 'O'){
            return;
        }

        mat[i][j] = 'K';

        traverse(mat, i + 1, j);
        traverse(mat, i - 1, j);
        traverse(mat, i, j + 1);
        traverse(mat, i, j - 1);
    }
}
