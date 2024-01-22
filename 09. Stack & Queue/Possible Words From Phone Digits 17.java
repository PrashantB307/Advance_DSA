

//   https://leetcode.com/problems/letter-combinations-of-a-phone-number/

//   https://www.geeksforgeeks.org/problems/possible-words-from-phone-digits-1587115620/1

//   https://www.codingninjas.com/studio/problems/letter-combinations-of-a-phone-number_983623


import java.util.*;
class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> res = new ArrayList<>();

        if(digits.length() == 0){
            return res;
        }
        
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backtracking(digits, 0, map, new StringBuilder(), res);

        return res;
    }

    public void backtracking(String str, int i, HashMap<Character, String> map, StringBuilder sb, List<String> res){

        if(i == str.length()){
            res.add(sb.toString());
            return;
        }

        String curr = map.get(str.charAt(i));

        for(int j = 0; j < curr.length(); j++){
            sb.append(curr.charAt(j));
            backtracking(str, i + 1, map, sb, res);
            sb.deleteCharAt(sb.length() - 1);
        }

    }
}