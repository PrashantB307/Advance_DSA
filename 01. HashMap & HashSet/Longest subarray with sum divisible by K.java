

//    https://practice.geeksforgeeks.org/problems/longest-subarray-with-sum-divisible-by-k1259/1


import java.util.*;
class Solution{
    int longSubarrWthSumDivByK(int arr[], int n, int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        int sum = 0;
        int rem = 0;
        int maxLen = 0;
       
        for(int i = 0; i < n; i++){
            sum += arr[i];
            rem = sum % k;
            if(rem < 0){
                rem += k;
            }

            if(map.containsKey(rem) == false){
                map.put(rem, i);
            }else{
                int idx = map.get(rem);
                int len = i - idx;
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }
 
}
