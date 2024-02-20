

//   https://practice.geeksforgeeks.org/problems/smallest-distant-window3132/1


import java.util.*;
class Solution {
    public int findSubString(String str) {
        
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            set.add(ch);
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int mlen = str.length();
        int i = -1;
        int j = -1;

        while (true) {

            boolean f1 = false;
            boolean f2 = false;

            while (i < str.length() - 1 && map.size() < set.size()) {
                f1 = true;
                i++;
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            while (j < i && map.size() == set.size()) {
                f2 = true;
                
                int len = i - j;
                mlen = Math.min(mlen, len);
                
                j++;
                char ch = str.charAt(j);
              
                if(map.get(ch) == 1){
                    map.remove(ch);
                }else{
                     map.put(ch, map.get(ch) - 1);
                }
            }

            if(f1 == false && f2 == false){
                break;
            }
        }

        return mlen;
    }
}