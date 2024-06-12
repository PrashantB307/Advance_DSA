

//    https://www.geeksforgeeks.org/problems/diagonal-morning-assembly0028/1


import java.util.*;
class Solution {
    void diagonalSort(int matrix[][], int n, int m) {

        int r = 0;
        int c = 0;
        int k = 0;
        
        for (int i = 1; i < n; i++) {
            ArrayList<Integer> alist = new ArrayList<>();
            r = i;
            c = 0;
            
            while (r < n && c < m) {
                alist.add(matrix[r][c]);
                c++;
                r++;
            }
            
            Collections.sort(alist);
            
            r = i;
            c = 0;
            k = 0;
            
            while (r < n && c < m) {
                matrix[r][c] = alist.get(k++);
                r++;
                c++;
            }
        }

        for (int j = 1; j < m; j++) {
            ArrayList<Integer> alist = new ArrayList<>();
            r = 0;
            c = j;
            
            while (r < n && c < m) {
                alist.add(matrix[r][c]);
                c++;
                r++;
            }
            
            Collections.sort(alist, Collections.reverseOrder());
            
            r = 0;
            c = j;
            k = 0;
            
            while (r < n && c < m) {
                matrix[r][c] = alist.get(k++);
                r++;
                c++;
            }
        }
    }
}