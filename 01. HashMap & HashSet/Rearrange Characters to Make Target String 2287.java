

//   https://leetcode.com/problems/rearrange-characters-to-make-target-string/


import java.util.*;
class Solution {
    public int rearrangeCharacters(String s, String tar) {
        
        HashMap<Character, Integer> Smap = new HashMap<>();
        HashMap<Character, Integer> Tmap = new HashMap<>();

        for(char ch  : s.toCharArray()){
            Smap.put(ch, Smap.getOrDefault(ch, 0) + 1);
        }

        for(char ch  : tar.toCharArray()){
            Tmap.put(ch, Tmap.getOrDefault(ch, 0) + 1);
        }

        int len = 0;
        int ans = Integer.MAX_VALUE;

        for(char ch : tar.toCharArray()){
            int x = Smap.getOrDefault(ch, 0);
            int y = Tmap.getOrDefault(ch, 0);

            if(x >= y){
                ans = Math.min(ans, x / y);
                len++;
            }else{
                break;
            }
        }

        if(len == tar.length()){
            return ans;
        }

        return 0;
    }
}