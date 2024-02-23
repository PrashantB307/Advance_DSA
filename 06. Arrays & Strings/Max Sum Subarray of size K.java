

//    https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1


import java.util.*;
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
       
        int i = 0;
        long sum = 0;

        while (i < K) {
            sum += Arr.get(i);
            i++;
        }

        long max = sum;
        while (i < N) {
            sum -= Arr.get(i - K);
            sum += Arr.get(i);

            max = Math.max(max, sum);
            i++;
        }

        return max;
    }
}