

//   https://www.geeksforgeeks.org/problems/smallest-window-containing-0-1-and-2--170637/1

import java.util.*;
class Solution {
    public int smallestSubstring(String S) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        int len = Integer.MAX_VALUE;
        int st = 0;

        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if(map.size() == 3){

                while (st < i &&  map.get(S.charAt(st)) > 1){
                    map.put(S.charAt(st), map.getOrDefault(S.charAt(st), 0) - 1);
                    st++;
                }

                len = Math.min(len, i - st + 1);
            }
        }

        return len == Integer.MAX_VALUE ? -1 : len;
    }
};
