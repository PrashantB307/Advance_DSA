

//    https://leetcode.com/problems/count-prefixes-of-a-given-string/


class Solution {
    public int countPrefixes(String[] words, String str) {
        int cnt = 0;
        for (String s : words) {
            if(str.startsWith(s)){
                cnt++;
            }
        }

        return cnt;
    }
}