

//   https://practice.geeksforgeeks.org/problems/zero-sum-subarrays1825/1

//   https://www.codingninjas.com/studio/problems/subarrays-with-zero-sum_3161876


import java.util.*;
class Solution{
    public static long findSubarray(long[] arr ,int n) {
        long ans = 0;
        long sum = 0;
        
        HashMap<Long, Long> map = new HashMap<>();
        map.put(sum, (long)1);
        for(long val: arr) {
            sum += val;

            if(map.containsKey(sum - 0)){
                ans += map.get(sum - 0);
            }

            if(map.containsKey(sum)){
                map.put(sum, map.get(sum) + 1);
            }else{
                map.put(sum, (long)1);
            }
        }
        
        return ans;
    }
}