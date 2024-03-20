

//   https://www.geeksforgeeks.org/problems/make-palindrome--170647/1


import java.util.*;
class Solution {
    static StringBuilder rev(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--)
            ans.append(s.charAt(i));
        return ans;
    }

    public static boolean makePalindrome(int n, String[] arr) {
        Set<String> map = new HashSet<>();
        for (String s : arr) {
            String rev = rev(s).toString();
            if (map.contains(rev))
                map.remove(rev);
            else
                map.add(s);
        }
        
        if (map.size() == 0)
            return true;
        if (map.size() > 1)
            return false;
        String s = "";
        for (String key : map)
            s = key;
        return isPal(s);
    }

    static boolean isPal(String s) {
        int lo = 0, hi = s.length() - 1;
        while (lo < hi) {
            if (s.charAt(lo++) != s.charAt(hi--))
                return false;
        }
        return true;
    }
}
