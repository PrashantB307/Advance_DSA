

//    https://leetcode.com/problems/sort-array-by-increasing-frequency/


import java.util.*;
class Solution {
    public int[] frequencySort(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int val : nums) {
            list.add(val);
        }

        Collections.sort(list, (a, b) -> {
            if (map.get(a) != map.get(b)) {
                return map.get(a) - map.get(b);
            } else {
                return b - a;
            }
        });

        for(int i = 0; i < list.size(); i++){
            nums[i] = list.get(i);
        }

        return nums;
    }
}