

//    https://leetcode.com/problems/degree-of-an-array/


import java.util.*;
class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int max = 0;

        for(int n : nums){
            list.add(n);
            map.put(n, map.getOrDefault(n, 0) + 1);
            max = Math.max(max, map.get(n));
        }

       int min = Integer.MAX_VALUE;

        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue() == max){
                int val = m.getKey();
                int i = list.indexOf(val);
                int j = list.lastIndexOf(val);
                
                if(j - i + 1 < min){
                    min = j - i + 1;
                    
                }
            }
        }

        return min;
    }
}