

//    https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram


class Solution {
    public int minSteps(String s, String t) {
        
        int[] s1 = new int[26];
        int[] t1 = new int[26];

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            s1[ch - 'a']++;
        }

        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            t1[ch - 'a']++;
        }

        int step = 0;

        for(int i = 0; i < 26; i++){
            step += Math.abs(s1[i] - t1[i]);
        }

        return step / 2;
    }
}