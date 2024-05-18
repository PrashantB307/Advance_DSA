

//   https://leetcode.com/problems/number-of-substrings-with-only-1s/


class Solution {
    public int numSub(String s) {
        int i = 0, j = 0;
        int mod = 1000000007;
        int ans = 0;

        while(j < s.length()){
            if(s.charAt(j) == '0'){
                i = j + 1;
                j++;
            }else{
                ans = (ans + j - i + 1) % mod;
                j++;
            }
        }

        return ans % mod;
    }
}