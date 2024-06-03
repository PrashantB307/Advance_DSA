

//   https://leetcode.com/problems/capitalize-the-title/


class Solution {
    public String capitalizeTitle(String title) {

        title = title.toLowerCase();
        String[] str = title.split(" ");
        String ans = "";

        for (String s : str) {
            if (s.length() > 2) {
                s = s.replaceFirst(s.charAt(0) + "", (char) (s.charAt(0) - 32) + "");
            }

            ans += s + " ";
        }

        return ans.substring(0, ans.length() - 1);
    }
}