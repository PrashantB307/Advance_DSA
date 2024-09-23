

//   https://www.geeksforgeeks.org/problems/k-pangrams0909/1


import java.util.*;
class Solution {
    boolean kPangram(String str, int k) {

        Set<Character> set = new HashSet<>();
        int total = 0;

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                total++;
                set.add(ch);
            }
        }

        int miss = 26 - set.size();
        if (total < 26) {
            return false;
        }

        return miss <= k;
    }
}