

//   https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/


import java.util.*;
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        if(mat == target){
            return true;
        }

        int n = mat.length;
        int[][] temp1 = new int[n][n];
        temp1 = mat.clone();

        for(int k = 0; k < 4; k++){
            int[][] temp2 = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    temp2[i][j] = temp1[n - 1- j][i];
                }
            }

            if(Arrays.deepEquals(target, temp2)){
                return true;
            }else{
                temp1 = temp2.clone();
            }
        }

        return false;
    }
}