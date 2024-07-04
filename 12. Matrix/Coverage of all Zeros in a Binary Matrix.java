

//   https://www.geeksforgeeks.org/problems/coverage-of-all-zeros-in-a-binary-matrix4024/1

//   https://www.naukri.com/code360/problems/array-sum_893287


import java.util.*;
class Solution {
    public int findCoverage(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        int cnt = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    if(i - 1 >= 0 && matrix[i - 1][j] == 1){
                        cnt++;
                    }
                    if(j + 1 < n && matrix[i][j + 1] == 1){
                        cnt++;
                    }
                    if(i + 1 < m && matrix[i + 1][j] == 1){
                        cnt++;
                    }
                    if(j - 1 >= 0 && matrix[i][j - 1] == 1){
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }
}


//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2 {

    public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {

        int count = 0;
        for (int i = 0; i < mat.size(); i++) {
            for (int j = 0; j < mat.get(i).size(); j++) {
                if (mat.get(i).get(j) == 0) {
                    if (j - 1 >= 0 && mat.get(i).get(j - 1) == 1) {
                        count++;
                    }
                    if (j + 1 < mat.get(i).size() && mat.get(i).get(j + 1) == 1) {
                        count++;
                    }
                    if (i - 1 >= 0 && mat.get(i - 1).get(j) == 1) {
                        count++;
                    }
                    if (i + 1 < mat.size() && mat.get(i + 1).get(j) == 1) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}