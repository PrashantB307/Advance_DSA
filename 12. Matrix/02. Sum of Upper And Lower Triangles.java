

//   https://www.geeksforgeeks.org/problems/sum-of-upper-and-lower-triangles-1587115621/1


import java.util.*;
class Solution{
    
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        ArrayList<Integer>list = new ArrayList<>();
        
        int upperSum = 0;
        int lowerSum = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    upperSum += matrix[i][j];
                    lowerSum += matrix[i][j];
                }else if(j > i){
                    upperSum += matrix[i][j];
                }else if(i > j){
                    lowerSum += matrix[i][j];
                }
            }
        }
        
        list.add(upperSum);
        list.add(lowerSum);
        
        return list;
    }
}