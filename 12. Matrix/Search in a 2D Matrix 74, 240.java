

//    https://leetcode.com/problems/search-a-2d-matrix/description/

//    https://practice.geeksforgeeks.org/problems/search-in-a-matrix-1587115621/1


class Solution {
    public boolean searchMatrix(int[][] mat, int tar) {
        int i = 0;
        int j = mat[0].length - 1;

        while(i < mat.length && j >= 0){
            if(tar > mat[i][j]){
                i++;
            }else if(tar < mat[i][j]){
                j--;
            }else if(tar == mat[i][j]){
                return true;
            }
        }

        return false;
    }
}