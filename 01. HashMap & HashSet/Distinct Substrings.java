

//    https://www.geeksforgeeks.org/problems/distinct-substrings2516/1


import java.util.*;
class Solution {
    int fun(String s) {

        HashSet<String> hs = new HashSet<>();
        String sb = "";

        for (int i = 0; i < s.length() - 1; i++) {
            sb = s.substring(i, i + 2);
            hs.add(sb);
        }

        return hs.size();

    }
}
