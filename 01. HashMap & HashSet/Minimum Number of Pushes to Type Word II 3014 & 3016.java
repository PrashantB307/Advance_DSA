

//   https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/

//   https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/


import java.util.*;
class Solution {
    public int minimumPushes(String word) {
        int ans = 0;
        int[] freq = new int[26];
        
        for(char ch : word.toCharArray()){
            freq[ch - 'a']++;
        }

        Arrays.sort(freq);

        for(int i = 0; i < 26; i++){
            ans += freq[26 - i - 1] * (i / 8 + 1);
        }

        return ans;
    }
}