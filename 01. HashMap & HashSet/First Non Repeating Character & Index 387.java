

//     https://practice.geeksforgeeks.org/problems/non-repeating-character-1587115620/1

//     https://leetcode.com/problems/first-unique-character-in-a-string/


class Solution {

    static char nonrepeatingCharacter(String S) {
        int[] freq = new int[256];

        for (int i = 0; i < S.length(); i++) {
            freq[S.charAt(i)]++;
        }

        for (int i = 0; i < S.length(); i++) {
            if (freq[S.charAt(i)] == 1) {
                return (char) S.charAt(i);
            }
        }

        return '$';
    }
}
