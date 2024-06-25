

//    https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/


import java.util.*;
class Solution {
    public boolean areOccurrencesEqual(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();
        for(char ch : map.keySet()){
            set.add(map.get(ch));
        }

        return set.size() == 1;
    }
}