

//   https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers/

//   https://www.naukri.com/code360/problems/divide-array-in-k-sets-of-consecutive-numbers_1230544


import java.util.*;
class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length % k != 0){
            return false;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int val : nums){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        while(map.size() > 0){
            int val = map.firstKey();

            for(int i = 1; i < k; i++){
                if(map.containsKey(val + i)){
                    map.put(val + i, map.getOrDefault(val + i, 0) - 1);

                    if(map.get(val + i) == 0){
                        map.remove(val + i);
                    }
                }else{
                    return false;
                } 
            }

            map.put(val, map.getOrDefault(val, 0) - 1);
            if(map.get(val) == 0){
                map.remove(val);
            }
        }

        return true;
    }
}