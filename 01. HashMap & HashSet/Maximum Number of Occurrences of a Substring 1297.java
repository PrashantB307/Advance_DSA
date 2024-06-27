

//   https://leetcode.com/problems/maximum-number-of-occurrences-of-a-substring/


import java.util.*;
class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        
        int[] freq = new int[26];
        int letters = 0;
        int max = 0;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0, j = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(++freq[ch - 'a'] == 1){
                letters++;
            }

            while (letters > maxLetters || i - j + 1 > maxSize) {
                if(--freq[s.charAt(j) - 'a'] == 0){
                    letters--;
                }
                
                j++;
            }

            while (i - j + 1 >= minSize) {
                String str = s.substring(j, i + 1);
                map.put(str, map.getOrDefault(str, 0) + 1);
                max = Math.max(max, map.get(str));

                if(--freq[s.charAt(j) - 'a'] == 0){
                    letters--;
                }

                j++;
            }
        }

        return max;
    }
}


// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2 {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;

        for(int i = 0; i < s.length() - minSize + 1; i++){
            String str = s.substring(i, i + minSize);
            if(isValid(str, maxLetters, maxSize)){
                map.put(str, map.getOrDefault(str, 0) + 1);
                max = Math.max(max, map.get(str));
            }
        }

        return max;
    }

    boolean isValid(String str, int maxLetters, int maxSize){
        HashSet<Character> set = new HashSet<>();
        for(char ch : str.toCharArray()){
            set.add(ch);
        }

        return set.size() <= maxLetters && str.length() <= maxSize;
    }
}