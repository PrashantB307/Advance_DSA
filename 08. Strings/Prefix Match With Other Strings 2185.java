

//    https://practice.geeksforgeeks.org/problems/prefix-match-with-other-strings/1

//    https://leetcode.com/problems/counting-words-with-a-given-prefix/description/


class Solution {
    public int klengthpref(String[] arr, int n, int k, String str) {
        if (k > str.length()) {
            return 0;
        }

        String ans = "";
        for (int i = 0; i < k; i++) {
            char ch = str.charAt(i);
            ans += ch;
        }

        int cnt = 0;
        for (String s : arr) {
            int c = 0;
            if (s.length() >= k) {

                for (int i = 0; i < k; i++) {
                    if (s.charAt(i) == ans.charAt(i)) {
                        c++;
                    }
                }
                if (c == k) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}


//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX======>   Leetcode   <=====XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2 {
    public int prefixCount(String[] words, String pref) {
        int k = pref.length();
        int cnt = 0;
        for (String s : words) {
            int c = 0;
            if (s.length() >= k) {

                for (int i = 0; i < k; i++) {
                    if (s.charAt(i) == pref.charAt(i)) {
                        c++;
                    }
                }
                if (c == k) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}