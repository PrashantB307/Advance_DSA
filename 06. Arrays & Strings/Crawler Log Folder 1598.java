

//   https://leetcode.com/problems/crawler-log-folder/


class Solution {
    public int minOperations(String[] logs) {
        int lvl = 0;

        for (String oper : logs) {
            if (oper.equals("../")) {
                lvl = Math.max(0, lvl - 1);
            }else if (oper.equals("./")) {

            }else {
                lvl += 1;
            }
        }

        return lvl;
    }
}