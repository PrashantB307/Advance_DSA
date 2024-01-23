

//    https://practice.geeksforgeeks.org/problems/postfix-to-infix-conversion/1


import java.util.*;
class Solution {
    static String postToInfix(String exp) {

        Stack<String> ans = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ans.push(ch + "");
            } else {

                String sval = ans.pop();
                String fval = ans.pop();

                ans.push("(" + fval + ch + sval + ")");

            }
        }

        return ans.peek();
    }
}
