

//    https://www.geeksforgeeks.org/problems/boundary-elements-of-matrix1102/1

//    https://www.codingninjas.com/studio/problems/matrix-boundary-traversal_5026486


import java.util.*;
class Solution
{
    public int[] BoundaryElements(int[][] matrix)
    {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(helper(i, j, m, n) == true){
                    list.add(matrix[i][j]);
                }
            }
        }
        
        int[] ans = new int[list.size()];
        int i = 0;
        for(int val : list){
            ans[i++] = val;
        }
        
        return ans;
    }
    
    public boolean helper(int i, int j, int m, int n){
        if(i == 0 || j == 0 || i == m - 1 || j == n - 1){
            return true;
        }
        
        return false;
    }
}