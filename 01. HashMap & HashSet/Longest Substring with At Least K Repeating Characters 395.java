

//    https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/


class Solution {
    public int longestSubstring(String s, int k) {
        
        return helper(s.toCharArray(), 0, s.length(), k);
    }

    int helper(char[] ch, int st, int end, int k){
        if(end - st < k){
            return 0;
        }

        int[] frqc = new int[26];
        for(int i = st; i < end; i++){
            frqc[ch[i] - 'a']++;
        }

        for(int i = st; i < end; i++){
            if(frqc[ch[i] - 'a'] < k){
                int j = i + 1;

                while (j < end && frqc[ch[j] - 'a'] < k){
                    j++;
                }

                return Math.max(helper(ch, st, i, k), helper(ch, j, end, k));
            }
        }


        return end - st;
    }
}