

//    https://www.geeksforgeeks.org/problems/match-specific-pattern/1

//   https://www.naukri.com/code360/problems/match-specific-pattern_981301


import java.util.*;
class GfG {
    public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern) {

        int dictSize = dict.size();
        int pattSize = pattern.length();

        ArrayList<String> ans = new ArrayList<>();
        Map<Character, Integer> pMap = new LinkedHashMap<>();

        for (int i = 0; i < pattSize; i++) {
            char ch = pattern.charAt(i);
            if (pMap.containsKey(ch)) {
                pMap.put(ch, pMap.get(ch) + 1);
            } else {
                pMap.put(ch, 1);
            }
        }

        for (int i = 0; i < dictSize; i++) {

            Map<Character, Integer> sMap = new LinkedHashMap<>();

            String str = dict.get(i);

            for (int j = 0; j < str.length(); j++) {

                char ch = str.charAt(j);
                if (sMap.containsKey(ch)) {
                    sMap.put(ch, sMap.get(ch) + 1);
                } else {
                    sMap.put(ch, 1);
                }
            }

            if (pMap.size() == sMap.size()) {

                String pMapValues = pMap.values().toString();
                String sMapValues = sMap.values().toString();

                if (sMapValues.equals(pMapValues)) {
                    ans.add(str);
                }
            }
        }

        return ans;
    }
}