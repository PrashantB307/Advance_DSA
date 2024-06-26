

//   https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/description/

//   https://www.naukri.com/code360/problems/lexicographically-smallest-subsequence-of-distinct-characters_1461489


import java.util.*;
class Solution {
    public String smallestSubsequence(String s) {
        int[] lastIndex = new int[26];

        for (int i = 0; i < s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }
            
        
        boolean[] seen = new boolean[26];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';

            if (seen[c])
                continue;

            while (!st.isEmpty() && st.peek() > c && i < lastIndex[st.peek()]) {
                seen[st.pop()] = false;
            }
            
            st.push(c);
            seen[c] = true;
        }

        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append((char) (st.pop() + 'a'));
        }

        return sb.reverse().toString();
    }
}