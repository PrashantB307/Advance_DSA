

//   https://leetcode.com/problems/word-break-ii

//   https://www.geeksforgeeks.org/problems/word-break-part-23249/1


import java.util.*;
class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {

        HashSet<String> set = new HashSet<>(wordDict);

        return helper(s, 0, set);
    }

    public List<String> helper(String s, int i, HashSet<String> set) {

        List<String> ans = new ArrayList<>();

        if (i == s.length()){
            ans.add("");
        }
           
        for (int j = i + 1; j <= s.length(); j++) {
            String prefix = s.substring(i, j);

            if (set.contains(prefix)) {
                List<String> suffixes = helper(s, j, set);
                
                for (String suffix : suffixes) {
                    ans.add(prefix + (suffix.equals("") ? "" : " ") + suffix);
                }
            }
        }

        return ans;
    }
}