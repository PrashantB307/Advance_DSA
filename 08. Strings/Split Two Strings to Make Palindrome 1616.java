

//   https://leetcode.com/problems/split-two-strings-to-make-palindrome/


class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        
        int n = a.length();
        if (isPalindrome(a, 0, n - 1) || isPalindrome(b, 0, n - 1))
            return true;

        return checkPalindrome(a, b, n) || checkPalindrome(b, a, n);
    }

    private boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--))
                return false;
        }
        return true;
    }

    private boolean checkPalindrome(String a, String b, int n) {
        int i = 0, j = n - 1;
        while (i < j && a.charAt(i) == b.charAt(j)) {
            i++;
            j--;
        }
        
        return isPalindrome(a, i, j) || isPalindrome(b, i, j);
    }
}