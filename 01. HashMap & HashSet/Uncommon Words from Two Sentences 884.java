

//   https://leetcode.com/problems/uncommon-words-from-two-sentences/


import java.util.*;
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        String arr1[] = s1.split(" ");
        String arr2[] = s2.split(" ");

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for (String s : arr1) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }

        for (String s : arr2) {
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }

        HashSet<String> hp = new HashSet<>();
        for (var a : map1.keySet()) {
            if (map1.get(a) == 1) {
                if (!map2.containsKey(a))
                    hp.add(a);
            }
        }

        for (var a : map2.keySet()) {
            if (map2.get(a) == 1) {
                if (!map1.containsKey(a))
                    hp.add(a);
            }
        }

        String ans[] = new String[hp.size()];
        int idx = 0;
        for (var a : hp)
            ans[idx++] = a;
        return ans;
    }
}