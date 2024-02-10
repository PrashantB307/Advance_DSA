

//    https://leetcode.com/problems/distribute-candies/


import java.util.*;
class Solution {
    public int distributeCandies(int[] candyType) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : candyType){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        int allowed = candyType.length / 2;
        
        if(map.size() <= allowed){
            return allowed;
        }
        
        return allowed;
    }
}