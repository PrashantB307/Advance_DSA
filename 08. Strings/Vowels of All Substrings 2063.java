

//  https://leetcode.com/problems/vowels-of-all-substrings/


class Solution {
    public long countVowels(String word) {

        int n = word.length();
        long sum = 0;

        for (int i = n - 1; i >= 0; i--) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sum += (long)(i + 1) * (n - i);
            }
        }

        return sum;
    }
}