

//  https://leetcode.com/problems/determine-if-two-strings-are-close/

//  https://www.codingninjas.com/studio/problems/strings-challenge_1462454


import java.util.*;
class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        if(word1.length() != word2.length()){
            return false;
        }

        int[] w1 = new int[26];
        int[] w2 = new int[26];
        
        for(char ch : word1.toCharArray()){
            w1[ch - 'a']++;
        }

        for(char ch : word2.toCharArray()){
            w2[ch - 'a']++;
        }

        for(int i = 0 ;i < 26; i++){
            if((w1[i] == 0 && w2[i] != 0) || (w1[i] != 0 && w2[i] == 0)){
                return false;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : w1){
            if(i > 0){
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        for(int i : w2){
            if(i > 0){
                if(!map.containsKey(i)){
                    return false;
                }

                map.put(i, map.get(i) - 1);
                if(map.get(i) == 0){
                    map.remove(i);
                }
            }
        }

        return map.size() == 0;
    }
}