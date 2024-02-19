

//   https://leetcode.com/problems/repeated-dna-sequences/

//   https://www.codingninjas.com/studio/problems/repeated-substrings_1387094


import java.util.*;
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length() - 10; i++){
            String str = s.substring(i, i + 10);

            if(s.substring(i).contains(str)){
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        ArrayList<String> list = new ArrayList<>();

        for(Map.Entry<String, Integer> mp : map.entrySet()){
            if(mp.getValue() > 1){
                list.add(mp.getKey());
            }
        }

        return list;
    }
}