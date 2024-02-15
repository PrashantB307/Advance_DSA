

//    https://leetcode.com/problems/longest-palindrome/description/


class Solution {
    public int longestPalindrome(String s) {
        int ans = 0;
        int[] freqMap = new int[128];

        for(char ch : s.toCharArray()){
            freqMap[ch]++;
        }

        for(int i = 0; i < 128; i++){
            int val = freqMap[i];
            ans += (val / 2) * 2;
            if(ans % 2 == 0 && val % 2 == 1){
                ans++;
            }
        }

        return ans;
    }
}