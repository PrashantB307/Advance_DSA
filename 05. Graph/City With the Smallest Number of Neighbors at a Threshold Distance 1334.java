

//   https://www.geeksforgeeks.org/problems/city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/1

//   https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/


import java.util.*;
class Solution {
    int findCity(int n, int m, int[][] edges,int distanceThreshold)
    {
       int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE / 2); 
            dist[i][i] = 0;
        }
        
       
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];
            dist[from][to] = weight;
            dist[to][from] = weight; 
        }
        
       
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        
        int minCities = Integer.MAX_VALUE;
        int ans = -1;
    
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (dist[i][j] <= distanceThreshold) {
                    cnt++;
                }
            }

            if (cnt < minCities || (cnt == minCities && i > ans)) {
                minCities = cnt;
                ans = i;
            }
        }
        
        return ans;
    }
}