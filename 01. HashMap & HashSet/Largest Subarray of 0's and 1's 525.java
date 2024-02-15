

//    https://leetcode.com/problems/contiguous-array/

//    https://practice.geeksforgeeks.org/problems/largest-subarray-of-0s-and-1s/1

//    https://www.codingninjas.com/studio/problems/largest-subarray-with-equal-number-of-0s-and-1s_839812


import java.util.*;
class Solution {
    public int findMaxLength(int[] nums) {
        
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                sum += -1;
            }else{
                sum += 1;
            }

            if(map.containsKey(sum)){
                int idx = map.get(sum);
                int len = i - idx;
                ans = Math.max(ans, len);
            }else{
                map.put(sum, i);
            }
        }

        return ans;
    }
}