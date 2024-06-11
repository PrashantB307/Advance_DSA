

//    https://www.geeksforgeeks.org/problems/print-diagonally4331/1


import java.util.*;
class Solution{
    static ArrayList<Integer> downwardDiagonal(int N, int matrix[][])
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        
        for(int i=0;i<row;i++){
            int pos = 0;
            for(int j=i;j>=0;j--){
                ans.add(matrix[pos][j]);
                pos++;
            }
        }
        
        for(int i=1;i<row;i++){
            int pos = i;
            for(int j=col-1;j>=i;j--){
                ans.add(matrix[pos][j]);
                pos++;
            }
        }
        return ans;
        
    }
}