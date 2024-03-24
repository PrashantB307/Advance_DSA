

//   https://www.geeksforgeeks.org/problems/aggressive-cows/1

//   https://www.codingninjas.com/studio/problems/aggressive-cows_1082559


import java.util.*;
class Solution {
    public static int solve(int n, int k, int[] stalls) {

        Arrays.sort(stalls);
        int l = 1;
        int r = stalls[n -1] - stalls[0];

        while (l <= r) {
            int mid = (l + r) / 2;

            if(isPossible(k, stalls, mid)){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }

        return r;
    }

    static boolean isPossible(int k, int[] arr, int diff){
        int cnt = 1;
        int prev = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] - prev >= diff){
                prev = arr[i];
                cnt++;   
            }
        }

        return cnt >= k;
    }
}