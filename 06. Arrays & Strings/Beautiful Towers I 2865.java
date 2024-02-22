


import java.util.*;
class Solution {
    public long maximumSumOfHeights(List<Integer> hight) {
        
        long ans = 0;
        int n = hight.size();

        for(int i = 0; i < n; i++){
            int[] arr = new int[n];
            int l = i - 1;
            int r = i + 1;
            
            while (l >= 0) {
                if(hight.get(l) <= arr[l + 1]){
                    arr[l] = hight.get(l);
                }else{
                    arr[l] = arr[l + 1];
                }

                l--;
            }

            while (r < n) {
                if(hight.get(r) <= arr[r - 1]){
                    arr[r] = hight.get(r);
                }else{
                    arr[r] = arr[r - 1];
                }

                r++;
            }

            long sum = 0;
            for(int val : arr){
                sum += val;
            }

            ans = Math.max(ans, sum);
        }

        return ans;
    }
}