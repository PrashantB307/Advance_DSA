

//   https://www.geeksforgeeks.org/problems/merging-two-unsorted-arrays-in-sorted-order1020/1


import java.util.*;
class Solution {
    void sortedMerge(long A[], long B[], long res[], int N, int M) {
        int k = 0;
        int i = 0;
        int j = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                res[k++] = A[i++];

            } else {
                res[k++] = B[j++];
            }
        }
        
        while (i < A.length) {
            res[k++] = A[i++];
        }
        
        while (j < B.length) {
            res[k++] = B[j++];
        }
    }
}