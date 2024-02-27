

//    https://practice.geeksforgeeks.org/problems/points-in-straight-line/1

//    https://leetcode.com/problems/max-points-on-a-line/


import java.util.*;
class GfG {
    int maxPoints(int X[], int Y[], int n) {

        int ans = 0;
        for (int i = 0; i < n; i++) {
            HashMap<Double, Integer> map = new HashMap<>();
            double x = 0;
            for(int j = 0; j < n; j++){
                if(i != j){
                    if(X[j] - X[i] == 0){
                        x = Integer.MAX_VALUE;
                    }else{
                        x = (double)(Y[j] - Y[i]) / (double)(X[j] - X[i]);
                    }

                    map.put(x, map.getOrDefault(x, 0)  + 1);
                    ans = Math.max(ans, map.get(x));
                }
            }
        }

        return ans + 1;
    }
}

//XXXXXXXXXXXXXXXXXXXXXXXXXXXXX======>     Leetcode     <=========XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2 {
    public int maxPoints(int[][] points) {
        int n = points.length;

        if(n <= 2){
            return n;
        }

        int ans = 2;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int temp = 2;

                for(int k = j + 1; k < n; k++){
                    int x = (points[j][1] - points[i][1]) * (points[k][0] - points[i][0]);
                    int y = (points[k][1] - points[i][1]) * (points[j][0] - points[i][0]);

                    if(x == y){
                        temp++;
                    }
                }

                ans = Math.max(ans, temp);
            }
        }

        return ans;
    }
}