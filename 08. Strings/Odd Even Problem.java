

//   https://www.geeksforgeeks.org/problems/help-nobita0532/1


import java.util.*;
class Solution {
    public static String oddEven(String S) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int odd = 0, even = 0, n = S.length();

        for (int i = 0; i < n; i++) {
            char ch = S.charAt(i);
            int x = ch - 'a' + 1; 
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (Integer key : map.keySet()) {
            if (key % 2 == 0 && (map.get(key)) % 2 == 0) {
                even++;
            } else if (key % 2 != 0 && (map.get(key) % 2 != 0)) {
                odd++;
            }
        }

        int sum = odd + even;
        
        if (sum % 2 == 0) {
            return "EVEN";
        }

        return "ODD";
    }
}
