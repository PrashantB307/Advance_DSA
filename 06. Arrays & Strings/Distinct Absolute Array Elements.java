

//    https://www.geeksforgeeks.org/problems/distinct-absolute-array-elements4529/1


import java.util.*;
class Solution {
    public int distinctCount(int[] arr) {
        
        Set<Integer> set = new HashSet<>();
        for(int val : arr){
            val = Math.abs(val);
            if(!set.contains(val)){
                set.add(val);
            }
        }

        return set.size();
    }
}