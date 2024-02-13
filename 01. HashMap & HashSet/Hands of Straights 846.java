

//   https://practice.geeksforgeeks.org/problems/hands-of-straights/1

//   https://leetcode.com/problems/hand-of-straights/


import java.util.*;
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
         if (hand.length % groupSize != 0) {
            return false;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int val : hand){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        while (map.size() > 0) {
            int val = map.firstKey();

            for(int i = 1; i < groupSize; i++){
                if(map.containsKey(val + i)){
                    map.put(val + i, map.get(val + i) -1);

                    if(map.get(val + i) == 0){
                        map.remove(val + i);
                    }
                }else{
                    return false;
                }
            }

            map.put(val, map.get(val) - 1);
            if(map.get(val) == 0){
                map.remove(val);
            }
        }

        return true;
    }
}