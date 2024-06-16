

//  https://www.geeksforgeeks.org/problems/special-array-reversal2328/1


import java.util.*;
class Solution {
    public String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        char[] ch = str.toCharArray();

        for (char c : ch) {
            if (Character.isLetter(c)) {
                stack.push(c);
            }
        }

        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                ch[i] = stack.pop();
            }
        }

        return new String(ch);
    }
}