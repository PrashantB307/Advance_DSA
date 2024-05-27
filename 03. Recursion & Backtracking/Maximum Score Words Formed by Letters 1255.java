

//   https://leetcode.com/problems/maximum-score-words-formed-by-letters/


import java.util.*;
class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : letters){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return helper(words, map, score, 0);
    }

    public int helper(String[] words, HashMap<Character, Integer> map, int[] score, int idx){

        if(idx == words.length){
            return 0;
        }

        int exclude = helper(words, map, score, idx + 1);

        int scrWord = 0;
        String word = words[idx];
        boolean flag = true;

        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);

            if(map.getOrDefault(ch, 0) == 0){
                flag = false;
            }

            map.put(ch, map.getOrDefault(ch, 0) - 1);
            scrWord += score[ch - 'a'];
        }

        int include = 0;
        if(flag){
            include = scrWord + helper(words, map, score, idx + 1);
        }

        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return Math.max(exclude, include);
    }
}