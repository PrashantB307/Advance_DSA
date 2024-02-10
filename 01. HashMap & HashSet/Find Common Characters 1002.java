

//    https://leetcode.com/problems/find-common-characters/description/


import java.util.*;
class Solution {
    public List<String> commonChars(String[] words) {
        
        List<String> ans = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < words[0].length(); i++){
            map.put(words[0].charAt(i), map.getOrDefault(words[0].charAt(i), 0) + 1);
        }

        for(int i = 1; i < words.length; i++){
            HashMap<Character, Integer> temp = new HashMap<>();

            for(int j = 0; j < words[i].length(); j++){
                char ch = words[i].charAt(j);

                if(map.containsKey(ch)){
                    temp.put(ch, Math.min(map.get(ch), temp.getOrDefault(ch, 0) + 1));
                }
            }

            map = temp;
        }

        for(char ch : map.keySet()){
            for(int i = 0; i < map.get(ch); i++){
                ans.add(ch + "");
            }
        }

        return ans;
    }
}