

//   https://www.geeksforgeeks.org/problems/remove-common-characters-and-concatenate-1587115621/1


import java.util.*;
class Solution {
    public static String concatenatedString(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s2.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (char ch : s1.toCharArray()) {
            if (!map.containsKey(ch)) {
                sb.append(ch);
            }
        }

        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s2.toCharArray()) {
            if (!map2.containsKey(ch)) {
                sb.append(ch);
            }
        }

        if (sb.length() == 0) {
            return "-1";
        }

        return sb.toString();

    }
}
