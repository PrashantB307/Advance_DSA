

//    https://leetcode.com/problems/subarray-sums-divisible-by-k/description/


import java.util.*;
class Solution
{
    long subCount(long arr[] ,int n,int k)
    {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        int rem = 0;
        
        map.put(0, 1);

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            rem = sum % k;

            if(rem < 0){
                rem += k;
            }

            if(map.containsKey(rem)){
                ans += map.get(rem);
                map.put(rem, map.get(rem) + 1);
            }else{
                map.put(rem, 1);
            }
        }
        return ans;
        
    }
}

