

//   https://www.geeksforgeeks.org/problems/rearrange-characters4649/1


import java.util.*;
class Solution {
    public static String rearrangeCharacters(String str) {

        StringBuilder p = new StringBuilder(str);
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char ch = 'a';
        int val = Integer.MIN_VALUE;
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (m.getValue() > val) {
                val = m.getValue();
                ch = m.getKey();
            }
        }

        int i = 0;
        while (val > 0 && i < str.length()) {
            p.setCharAt(i, ch);
            val--;
            i += 2;
        }

        if (val > 0){
            return "-1";
        }
           
        map.remove(ch);

        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            int v = m.getValue();
            while (v > 0) {
                if (i >= str.length()){
                    i = 1;
                }
                p.setCharAt(i, m.getKey());
                v--;
                i += 2;
            }
        }

        return p.toString();
    }
}