

//   https://leetcode.com/problems/camelcase-matching/

//   https://www.geeksforgeeks.org/problems/camelcase-pattern-matching2259/1


import java.util.*;
class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {

        List<Boolean> list = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
            boolean res = check(queries[i], pattern);
            list.add(res);
        }

        return list;
    }

    boolean check(String str, String patt) {

        int i = 0;
        int cap = 0;

        for (int j = 0; j < str.length(); j++) {
            if (i < patt.length() && str.charAt(j) == patt.charAt(i)) {
                i++;
            } else if (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') {
                cap++;
            }
        }

        return (i == patt.length() && cap == 0);
    }
}


// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX=========>      GFG     <========+XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2 {
    ArrayList<String> CamelCase(int N, String[] str, String Pattern) {
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int k = 0;
            for (int j = 0; j < str[i].length(); j++) {
                if (Character.isUpperCase(str[i].charAt(j))) {
                    if (str[i].charAt(j) == Pattern.charAt(k))
                        k++;
                    else
                        break;
                }
                if (k == Pattern.length()) {
                    ans.add(str[i]);
                    break;
                }
            }
        }

        Collections.sort(ans);
        if (ans.isEmpty()){
            ans.add("-1");
        }
           
        return ans;
    }
}