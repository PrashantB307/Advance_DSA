

//   https://leetcode.com/problems/minimum-suffix-flips/


class Solution {
    public int minFlips(String target) {
        
        int cnt = 0;
        char ch = '0';

        for(char c : target.toCharArray()){
            if(c != ch){
                cnt++;
                ch = c;
            }
        }

        return cnt;
    }
}