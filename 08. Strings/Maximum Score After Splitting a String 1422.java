

//   https://leetcode.com/problems/maximum-score-after-splitting-a-string/


class Solution {
    public int maxScore(String s) {
        
        int max = 0;

        for(int i = 0; i < s.length() - 1; i++){
            int curr = 0;

            for(int j = 0; j <= i; j++){
                if(s.charAt(j) == '0'){
                    curr++;
                }
            }

            for(int j = i + 1; j < s.length(); j++){
                if(s.charAt(j) == '1'){
                    curr++;
                }
            }

            max = Math.max(max, curr);
        }

        return max;
    }
}