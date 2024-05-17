

//    https://leetcode.com/problems/longest-substring-of-all-vowels-in-order/


class Solution {
    public int longestBeautifulSubstring(String word) {
        
        int cnt = 1;
        int len = 1;
        int maxLen = 0;

        for(int i = 1; i < word.length(); i++){
            if(word.charAt(i) == word.charAt(i - 1)){
                len++;
            }else if(word.charAt(i) > word.charAt(i - 1)){
                len++;
                cnt++;
            }else{
                cnt = 1;
                len = 1;
            }

            if(cnt == 5){
                maxLen = Math.max(len, maxLen);
            }
        }

        return maxLen;
    }
}