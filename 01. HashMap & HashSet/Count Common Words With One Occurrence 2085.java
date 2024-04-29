

//    https://leetcode.com/problems/count-common-words-with-one-occurrence/


import java.util.*;
class Solution {
    public int countWords(String[] words1, String[] words2) {

        HashMap<String, Integer> hm1 = new HashMap<>();
        HashMap<String, Integer> hm2 = new HashMap<>();

        int cnt = 0;

        for(String str : words1) {
            hm1.put(str, hm1.getOrDefault(str, 0) + 1);
        }

        for(String str : words2) {
            hm2.put(str, hm2.getOrDefault(str, 0) + 1);
        }

        for(String s : hm1.keySet()) {
            if (hm2.containsKey(s) && hm2.get(s) == 1 && hm1.get(s) == 1) {
                cnt++;
            }
        }

        return cnt;
    }
}