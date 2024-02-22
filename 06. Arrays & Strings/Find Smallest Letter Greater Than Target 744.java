

//   https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        boolean flag = false;
        int d = Integer.MAX_VALUE;
        char ans = 'a';

        for(int i = 0; i < letters.length; i++){
            int diff = letters[i] - target;
            
            if(diff < d && diff > 0){
                d = diff;
                ans = letters[i];
                flag = true;
            }
        }

        if(flag){
            return ans;
        }

        return letters[0];
    }
}