

//   https://www.geeksforgeeks.org/problems/min-sum-formed-by-digits3551/1

//   https://www.codingninjas.com/studio/problems/minimum-sum-of-two-numbers-formed-from-digits-of-an-array_1171162


import java.util.*;
class Solution {
    
    public static long minSum(int arr[], int n)
    {
        long a = 0;
        long b = 0;
        int i = 0;

        Arrays.sort(arr);

        while (i < n) {
            a = a * 10 + arr[i];
            i++;

            if(i < n){
                b = b * 10 + arr[i];
                i++;
            }
        }

        return a + b;
    }
}