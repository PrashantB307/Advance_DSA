

//   https://www.geeksforgeeks.org/problems/permutations-of-a-given-string-1587115620/1


import java.util.*;
class Solution {

    public ArrayList<String> permutation(String S) {
        ArrayList<String> ans = new ArrayList<>();

        helper(S, ans, "");

        Collections.sort(ans);

        return ans;
    }

    public void helper(String s, ArrayList<String> ans, String psf) {

        if (s.isEmpty()) {
            ans.add(psf);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String st = s.substring(0, i);
            String end = s.substring(i + 1);

            helper(st + end, ans, psf + ch);
        }
    }
}