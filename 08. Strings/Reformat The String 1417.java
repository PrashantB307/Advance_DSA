

//    https://leetcode.com/problems/reformat-the-string/


import java.util.*;
class Solution {
    public String reformat(String s) {
        int ch = 0, num = 0;
        List<Character> chars = new ArrayList<>();
        List<Character> digits = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                ch++;
                chars.add(c);
            } else {
                num++;
                digits.add(c);
            }
        }

        StringBuilder ans = new StringBuilder();
        int diff = Math.abs(ch - num);

        if (diff == 1 || diff == 0) {
            if (ch - num >= 0) {
                for (int i = 0; i < chars.size(); i++) {
                    ans.append(chars.get(i));

                    if (i < digits.size()) {
                        ans.append(digits.get(i));
                    }
                }
            } else {
                for (int i = 0; i < digits.size(); i++) {
                    ans.append(digits.get(i));

                    if (i < chars.size()) {
                        ans.append(chars.get(i));
                    }
                }
            }
        } else {
            return "";
        }

        return ans.toString();
    }
}
