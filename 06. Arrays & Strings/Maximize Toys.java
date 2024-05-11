

//   https://www.geeksforgeeks.org/problems/maximize-toys0331/1


import java.util.*;
class Solution{
    static int toyCount(int N, int K, int arr[])
    {
        Arrays.sort(arr);
        int cnt = 0;

        for(int val : arr){
            if(K >= val){
                K -= val;
                cnt++;
            }
        }

        return cnt;
    }
}