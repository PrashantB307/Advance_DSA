

//   https://leetcode.com/problems/custom-sort-string/

//   https://www.codingninjas.com/studio/problems/specific-order_1102295


import java.util.*;
class Solution {
    public String customSortString(String order, String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);

            if (map.containsKey(ch)) {
                int freq = map.get(ch);
                while (freq-- > 0) {
                    sb.append(ch);
                }

                map.put(ch, 0);
            }
        }

        for (char ch : s.toCharArray()) {
            if (map.get(ch) != 0) {
                sb.append(ch);
                map.put(ch, map.getOrDefault(ch, -1));
            }

        }

        return sb.toString();
    }
}