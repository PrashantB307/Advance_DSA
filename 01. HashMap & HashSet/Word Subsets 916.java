

//   https://leetcode.com/problems/word-subsets/


import java.util.*;
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {

        List<String> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();

        for (String a : words2) {
            Map<Character, Integer> temp = new HashMap<>();

            for (char ch : a.toCharArray()) {
                temp.put(ch, temp.getOrDefault(ch, 0) + 1);
            }

            for (char c : temp.keySet()) {
                if (map.containsKey(c)) {
                    map.put(c, Math.max(temp.get(c), map.get(c)));
                } else {
                    map.put(c, temp.get(c));
                }
            }
        }

        for (String a : words1) {
            Map<Character, Integer> temp = new HashMap<>();
            for (char ch : a.toCharArray()) {
                temp.put(ch, temp.getOrDefault(ch, 0) + 1);
            }

            boolean flag = true;
            for (char c : map.keySet()) {
                if (temp.containsKey(c) && temp.get(c) >= map.get(c)) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                list.add(a);
            }
        }

        return list;
    }
}