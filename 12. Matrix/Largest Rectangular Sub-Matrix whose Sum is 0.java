

//    https://www.geeksforgeeks.org/problems/largest-rectangular-sub-matrix-whose-sum-is-0/1

//    https://www.codingninjas.com/studio/problems/sub-matrix-with-sum-zero_1063254


import java.util.*;
class Solution {
    public static ArrayList<ArrayList<Integer>> sumZeroMatrix(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int[][] sum = new int[n][m];

        for (int i = 0; i < n; i++) {
            sum[i][0] = a[i][0];
            for (int j = 1; j < m; j++) {
                sum[i][j] = a[i][j] + sum[i][j - 1];
            }
        }

        int maxArea = 0, startRow = 0, endRow = -1, startCol = 0, endCol = -1;
        for (int c1 = 0; c1 < m; c1++) {
            for (int c2 = c1; c2 < m; c2++) {
                int[] temp = new int[n];
                for (int i = 0; i < n; i++) {
                    temp[i] = sum[i][c2] - (c1 > 0 ? sum[i][c1 - 1] : 0);
                }
                HashMap<Integer, Integer> mp = new HashMap<>();
                mp.put(0, -1);
                int currSum = 0;
                for (int i = 0; i < n; i++) {
                    currSum += temp[i];
                    if (mp.containsKey(currSum)) {
                        int area = (c2 - c1 + 1) * (i - mp.get(currSum));
                        if (area > maxArea) {
                            maxArea = area;
                            startRow = mp.get(currSum) + 1;
                            endRow = i;
                            startCol = c1;
                            endCol = c2;
                        }
                    } else {
                        mp.put(currSum, i);
                    }
                }
            }
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (maxArea == 0) return ans;
        for (int i = startRow; i <= endRow; i++) {
            ArrayList<Integer> t = new ArrayList<>();
            for (int j = startCol; j <= endCol; j++) {
                t.add(a[i][j]);
            }
            ans.add(t);
        }

        return ans;
    }
}