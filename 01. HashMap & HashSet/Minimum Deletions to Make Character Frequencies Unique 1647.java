

//    https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/

//    https://www.naukri.com/code360/problems/minimum-deletions-to-make-character-frequencies-unique_1461220


import java.util.*;
class Solution {
    public int minDeletions(String s) {

        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        HashSet<Integer> set = new HashSet<>();
        int cnt = 0;

        for(int i = 0; i < 26; i++){
            int fre = freq[i];

            while (set.contains(fre) && fre > 0) {
                cnt++;
                fre--;
            }

            set.add(fre);
        }

        return cnt;
        
    }
}