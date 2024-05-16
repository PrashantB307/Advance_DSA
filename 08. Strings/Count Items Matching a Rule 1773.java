

//   https://leetcode.com/problems/count-items-matching-a-rule/


import java.util.*;
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int cnt = 0;

        for (List<String> item : items) {
            if (ruleKey.equals("type")) {
                if (item.get(0).equals(ruleValue)) {
                    cnt++;
                }
            }

            if (ruleKey.equals("color")) {
                if (item.get(1).equals(ruleValue)) {
                    cnt++;
                }
            }

            if (ruleKey.equals("name")) {
                if (item.get(2).equals(ruleValue)) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}