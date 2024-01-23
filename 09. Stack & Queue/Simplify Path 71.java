
 
//   https://leetcode.com/problems/simplify-path/description/

//   https://www.codingninjas.com/studio/problems/simplify-the-directory_668400


import java.util.*;
class Solution {
    public String simplifyPath(String path) {
        
        Stack<String>st = new Stack<>();
        String[] strPath = path.split("/");

        for(String str : strPath){
            if(str.equals(".") || str.equals("")){
                continue;
            }else if(str.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(str);
            }
        }

        StringBuilder sb = new StringBuilder();

        if(st.isEmpty()){
            return "/";
        }

        for(String str : st){
            sb.append("/");
            sb.append(str);
        }

        return sb.toString();
    }
}