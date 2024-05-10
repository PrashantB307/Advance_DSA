

//    https://www.geeksforgeeks.org/problems/distribute-n-candies/1

//    https://leetcode.com/problems/distribute-candies-to-people/


import java.util.*;
class Solution {
    static Long[] distributeCandies(int N, int K) {
        
        Long[] arr = new Long[K];
        Arrays.fill(arr, 0l);
        int i = 0;

        while (N > 0) {
            if(i + 1 >= K){
                arr[i % K] += N;
                N = 0; 
            }else{
                long a = i + 1;
                arr[i % K] += a;
                N -= (i + 1); 
            }

            i++;
        }

        return arr;
    }
};