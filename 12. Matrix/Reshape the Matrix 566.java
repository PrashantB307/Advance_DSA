

//    https://leetcode.com/problems/reshape-the-matrix/


import java.util.*;
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int[][] ans = new int[r][c];

        if(mat.length * mat[0].length != r * c){
            return mat;
        }
        
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                list.add(mat[i][j]);
            }
        }

        int k = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                ans[i][j] = list.get(k);
                k++;
            }
        }

        return ans;

    }
}