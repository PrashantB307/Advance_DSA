

//   https://www.geeksforgeeks.org/problems/archana-and-her-tricky-string2910/1


import java.util.*;
class Solution {
    static String findString(String s) {

        String str = "";
        int diff = 0;
        
        Map<Character, Boolean> map = new TreeMap<>((o1, o2) -> Character.compare(o2, o1));
        
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), true);
        }
        
        int ans = Integer.MIN_VALUE;
        
        for (Map.Entry<Character, Boolean> entry : map.entrySet()) {
            char ch = entry.getKey();
            
            for (int i = 1; i <= 12; i++) {
                char c = ch;
                int cnt = 0;
                StringBuilder sb = new StringBuilder();
                int di = 0;

                while (map.containsKey(c) && map.get(c)) {
                    cnt++;
                    sb.append(c);
                    c = (char) (c - i);
                    di = i;
                }

                if ((ans < cnt) || (ans == cnt && di < diff)) {
                    ans = cnt;
                    str = sb.toString();
                    diff = di;
                }
            }
        }

        return str;

    }
}