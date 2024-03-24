

//   https://leetcode.com/problems/bag-of-tokens


import java.util.*;
class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        Arrays.sort(tokens);
        int l = 0;
        int r = tokens.length - 1;

        int score = 0;
        int maxScore = 0;

        while (l <= r) {
            if(power >= tokens[l]){
                power -= tokens[l++];
                score++;
                maxScore = Math.max(maxScore, score);
            }else if(score > 0){
                power += tokens[r--];
                score--;
            }else{
                break;
            }
        }

        return maxScore;
    }
}