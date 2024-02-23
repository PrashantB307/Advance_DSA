

//    https://practice.geeksforgeeks.org/problems/sum-of-subarrays2229/1


import java.util.*;
class Solution {
    long countPairs(int[] X, int[] Y, int m, int n) {
       
        long cnt = 0;
        Arrays.sort(X);
        Arrays.sort(Y);

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(Math.pow(X[i], Y[j]) > Math.pow(Y[j], X[i])) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}