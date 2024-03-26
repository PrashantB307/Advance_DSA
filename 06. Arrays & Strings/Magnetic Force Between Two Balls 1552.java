

//   https://leetcode.com/problems/magnetic-force-between-two-balls/


import java.util.*;
class Solution {
    public int maxDistance(int[] pos, int k) {
        int n = pos.length;
        Arrays.sort(pos);
        int l = 1;
        int r = pos[n - 1] - pos[0];

        while (l <= r) {
            int mid = (l + r) / 2;

            if(isPossible(k, pos, mid)){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }

        return r;
    }

    public boolean isPossible(int k, int[] arr, int diff){
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