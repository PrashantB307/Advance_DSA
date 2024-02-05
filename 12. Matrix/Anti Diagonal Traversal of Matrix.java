

//    https://www.geeksforgeeks.org/problems/print-diagonally1623/1


import java.util.*;
class Solution
{
    public int[] antiDiagonalPattern(int[][] matrix)
    {
        int n = matrix.length;
        ArrayList<Integer> list = new ArrayList<>();

        int row = 0;
        int col = 0;

        while(row < n && col < n){
            int i = col;
            int j = row;

            while(i >= 0 && j < n){
                list.add(matrix[j][i]);
                i--;
                j++;
            }

            if(col < n - 1 ){
                col++;
            }else{
                row++;
            }
        }

        int[] ans = new int[list.size()];
        int i = 0;
        for(int val : list){
            ans[i++] = val;
        }

        return ans;


        

    }
}