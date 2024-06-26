

//    https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/


import java.util.*;
class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        
        HashMap<String, String> map = new HashMap<>();
        for(List<String> list : knowledge){
            map.put(list.get(0), list.get(1));
        }

        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        boolean flag = false;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                flag = true;
            }else if(ch == ')'){
                flag = false;
                res.append(map.getOrDefault(temp.toString(), "?"));
                temp = new StringBuilder();

            }else{
                if(flag == false){
                    res.append(ch);
                }else{
                    temp.append(ch);
                }
            }
        }

        return res.toString();
    }
}