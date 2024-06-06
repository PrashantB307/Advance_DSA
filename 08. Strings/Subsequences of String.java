

//   https://www.naukri.com/code360/problems/subsequences-of-string_985087


import java.util.* ;
class Solution {
    public static ArrayList<String> subsequences(String str) {
        
        ArrayList<String> list = new ArrayList<>();
        helper(str, 0, "", list);

        return list;
    }

    public static void helper(String s, int idx, String str, ArrayList<String> list){
        if (idx >= s.length()) {
            if(str.length() > 0){
                list.add(str);
            }
            return;
        }

        helper(s, idx + 1, str, list);
        helper(s, idx + 1, str + s.charAt(idx), list);
    }
}