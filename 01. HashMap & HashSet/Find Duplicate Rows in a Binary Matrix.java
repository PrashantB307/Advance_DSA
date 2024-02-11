

//    https://practice.geeksforgeeks.org/problems/find-duplicate-rows-in-a-binary-matrix/1


import java.util.*;
class Solution
{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < m; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++){
                sb.append(matrix[i][j]);
            }

            if(set.contains(sb.toString())){
                list.add(i);
            }else{
                set.add(sb.toString());
            }
        }

        return list;
    }
}