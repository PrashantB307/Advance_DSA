

import java.util.*;
class Solution {
    static String preToPost(String exp) {
       
        Stack<String> postStack = new Stack<>();

        for(int i = exp.length() - 1; i >= 0; i--){
            char ch = exp.charAt(i);

            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')){
                postStack.push(ch + "");
            }else{

                String val2 = postStack.pop();
                String val1 = postStack.pop();

                postStack.push(val1 + val2 + ch);
            }
        }

        return postStack.peek();
    }
}
