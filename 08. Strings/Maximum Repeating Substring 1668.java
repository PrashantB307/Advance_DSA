

//    https://leetcode.com/problems/maximum-repeating-substring/


class Solution {
    public int maxRepeating(String sequence, String word) {
        
        int ans = 0;
        while (sequence.contains(word.repeat(ans))) {
            ans++;
        }
        return ans - 1;
    }
}