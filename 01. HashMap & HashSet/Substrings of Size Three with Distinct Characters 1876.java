

//    https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/


import java.util.*;
class Solution {
    public int countGoodSubstrings(String s) {

        if(s.length() < 3){
            return 0;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < 3; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int cnt= 0 ;
        if(map.size() == 3){
            cnt++;
        }

        int i = 3, j = 0;
        while (i < s.length()) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) - 1);
            if(map.get(s.charAt(j)) == 0){
                map.remove(s.charAt(j));
            }

            if(map.size() == 3){
                cnt++;
            }
            i++;
            j++;
        }

        return cnt;
    }
}