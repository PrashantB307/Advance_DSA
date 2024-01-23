

//   https://practice.geeksforgeeks.org/problems/prefix-to-infix-conversion/1

//   https://www.codingninjas.com/studio/problems/prefix-to-infix_1215000


import java.util.*;
class Solution {
    static String preToInfix(String prexp) {
       
        Stack<String> inStack = new Stack<>();

        for(int i = prexp.length() - 1; i >= 0; i--){
            char ch = prexp.charAt(i);

            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')){
                inStack.push(ch + "");
            }else{

                String val2 = inStack.pop();
                String val1 = inStack.pop();

                inStack.push('(' + val1 + ch + val2 + ')');
            }
        }

        return inStack.peek();
    }
}
