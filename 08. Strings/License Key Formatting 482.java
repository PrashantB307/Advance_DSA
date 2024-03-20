

//   https://leetcode.com/problems/license-key-formatting/

//   https://www.geeksforgeeks.org/problems/license-key-formatting/1


class Solution {
    public String licenseKeyFormatting(String s, int k) {
        
        int len = 0;
        StringBuilder sb = new StringBuilder();
        int n = s.length() - 1;
        s = s.toUpperCase();

        while (n >= 0) {
            if(Character.isDigit(s.charAt(n)) || Character.isLetter(s.charAt(n))){
                if(len == k){
                    sb.append('-');
                    len = 0;
                }

                sb.append(s.charAt(n));
                len++;
            }
            
            n--;
        }

        return sb.reverse().toString();
    }
}