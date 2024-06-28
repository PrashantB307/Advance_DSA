

//   https://leetcode.com/problems/split-a-string-into-the-max-number-of-unique-substrings/


import java.util.*;
class Solution {
    
    int max;
    public int maxUniqueSplit(String s) {

        max = 0;
        HashSet<String> set = new HashSet<>();
        split(0, set, s);

        return max;
    }

    public void split(int idx, HashSet<String> set, String str){

        if(idx >= str.length()){
            max = Math.max(set.size(), max);

            return;
        }

        for(int i = idx + 1; i <= str.length(); i++){
            String s = str.substring(idx, i);

            if(set.add(s)){
                split(i, set, str);
                set.remove(s);
            }
        }
    }
}