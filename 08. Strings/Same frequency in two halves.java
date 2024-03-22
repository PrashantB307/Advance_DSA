

//    https://www.geeksforgeeks.org/problems/riyas-test1450/1


import java.util.*;
class Solution {
    boolean passed(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        
        if (n % 2 != 0) {
            for(int i = 0; i < n / 2; i++){
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            for(int i = n / 2 + 1; i < n; i++){
                char ch = s.charAt(i);
                if(!map.containsKey(ch)){
                    return false;
                }else{
                    map.put(ch, map.getOrDefault(ch, 0) - 1);
                }

                if(map.get(ch) == 0){
                    map.remove(ch);
                }
            }
        }else{
            for(int i = 0; i < n / 2; i++){
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            for(int i = n / 2; i < n; i++){
                char ch = s.charAt(i);
                if(map.containsKey(ch)){
                    map.put(ch, map.getOrDefault(ch, 0) - 1);

                    if(map.get(ch) == 0){
                        map.remove(ch);
                    }
                }

                
            }
        }

        if(map.size() == 0){
            return true;
        }

        return false;
    }
}