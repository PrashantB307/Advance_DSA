

//   https://www.geeksforgeeks.org/problems/find-distinct-elements2054/1


import java.util.*;
class Solution {
    static int distinct(int M[][], int N) {
        Map<Integer, Integer> a = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            a.put(M[0][i], 0);
        }
        
        int max = N;
        for (int i = 1; i < N; i++) {
            int b = 0;
            for (int j = 0; j < N; j++) {
                if (a.containsKey(M[i][j]) && a.get(M[i][j]) == i - 1) {
                    b++;
                    a.put(M[i][j], a.get(M[i][j]) + 1);
                }
            }
            
            if (b < max) {
                max = b;
            }
        }

        return max;
    }
}