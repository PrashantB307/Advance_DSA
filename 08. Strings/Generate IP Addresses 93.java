

//   https://www.geeksforgeeks.org/problems/generate-ip-addresses/1

//   https://leetcode.com/problems/restore-ip-addresses/description/


import java.util.*;
class Solution {
    public ArrayList<String> genIp(String s) {

        ArrayList<String> list = new ArrayList<>();
        int n = s.length();

        if (n > 12) {
            list.add("-1");
            return list;
        }

        for (int i = 1; i <= 3 && i < n - 2; i++) {
            for (int j = i + 1; j <= i + 3 && j < n - 1; j++) {
                for (int k = j + 1; k <= j + 3 && k < n; k++) {
                    String a = s.substring(0, i);
                    String b = s.substring(i, j);
                    String c = s.substring(j, k);
                    String d = s.substring(k, n);

                    if (isValid(a) && isValid(b) && isValid(c) && isValid(d)) {
                        list.add(a + "." + b + "." + c + "." + d);
                    }

                }
            }
        }

        return list;
    }

    boolean isValid(String s) {
        int n = s.length();
        if (n == 0 || n > 3 || (s.charAt(0) == '0' && n > 1) || Integer.parseInt(s) > 255) {
            return false;
        }

        return true;
    }
}