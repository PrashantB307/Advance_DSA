

//   https://www.geeksforgeeks.org/problems/find-minimum-number-of-laptops-required--170645/1


import java.util.*;
class Solution {
    public int minLaptops(int N, int[] start, int[] end) {
        
        Arrays.sort(start);
        Arrays.sort(end);

        int lap = 0, maxLap = 0;
        int i = 0, j = 0;

        while (i < N && j < N) {
            if(start[i] < end[j]){
                lap++;

                maxLap = Math.max(maxLap, lap);
                i++;
            }else{
                lap--;
                j++;
            }
        }

        return maxLap;
    }
}