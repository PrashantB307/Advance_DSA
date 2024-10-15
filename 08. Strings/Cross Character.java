

//    https://www.geeksforgeeks.org/problems/cross-character2630/1


class Solution {
    static String crossPattern(String s) {
      
        StringBuilder str = new StringBuilder();

        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i == j) {
                    str.append(s.charAt(i));
                } else if ((i + j) == s.length() - 1) {
                    str.append(s.charAt(j));
                } else {
                    str.append(" ");
                }
            }
        }
        
        return str.toString();
    }
}