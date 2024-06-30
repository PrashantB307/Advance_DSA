

//   https://www.geeksforgeeks.org/problems/count-of-substrings-containing-k-ones2304/1

//   https://www.naukri.com/code360/problems/count-substrings-with-k-ones_3128698


import java.util.*;
class Solution {
    long countOfSubstringWithKOnes(String S, int K) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int onces = 0;
        long ans = 0;

        for (char ch : S.toCharArray()) {
            if (ch == '1') {
                onces++;
            }

            if(map.containsKey(onces - K)){
                ans += map.get(onces - K);
            }

            map.put(onces, map.getOrDefault(onces, 0) + 1);
        }

        return ans;
    }
}