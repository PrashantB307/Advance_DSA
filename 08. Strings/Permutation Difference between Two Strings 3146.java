

//    https://leetcode.com/problems/permutation-difference-between-two-strings/


class Solution {
    public int findPermutationDifference(String s, String t) {

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int val = t.indexOf(ch);
            sum = sum + (Math.abs(i - val));
        }

        return sum;
    }
}