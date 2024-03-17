
import java.util.*;
class Solution {
    boolean sameFreq(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(char val : map.keySet()){
            list.add(map.get(val));
        }

        Collections.sort(list);

        int cnt = 0;
        for(int i = 1; i < list.size(); i++){
            int diff = list.get(i) - list.get(i - 1);
            if(diff > 1){
                return false;
            }else if(diff == 1){
                cnt++;
            }else if(diff == 0){
                continue;
            }

            if(cnt > 2){
                return false;
            }
        }

        return true;
    }
}