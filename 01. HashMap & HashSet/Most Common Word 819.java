

//   https://leetcode.com/problems/most-common-word/description/

//   https://www.naukri.com/code360/problems/most-frequent-word_1082313


import java.util.*;
class Solution {
    public String mostCommonWord(String str, String[] ban) {
        
        str = str.toLowerCase().replaceAll("\\W+", " ");
        String[] arr = str.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        HashSet<String> set = new HashSet<>();

        for (String s : ban) {
            set.add(s);
        }

        int freq = 0;
        String ans = "";

        for (String s : map.keySet()) {
            if (map.get(s) > freq && !set.contains(s)) {
                freq = map.get(s);
                ans = s;
            }
        }

        return ans;
    }
}