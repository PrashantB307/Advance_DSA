

//    https://leetcode.com/problems/alert-using-same-key-card-three-or-more-times-in-a-one-hour-period/


import java.util.*;
class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        
        HashMap<String, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < keyName.length; i++){
            String name = keyName[i];
            int time = intoMinutes(keyTime[i]);

            map.putIfAbsent(name, new ArrayList<>());
            map.get(name).add(time);
        }

        TreeSet<String> names = new TreeSet<>();

        for(String name : map.keySet()){
            List<Integer> times = map.get(name);
            Collections.sort(times);

            for(int i = 0; i < times.size() - 2; i++){
                int curr = times.get(i);
                int last = times.get(i + 2);

                if(last - curr <= 60){
                    names.add(name);
                    break;
                }
            }
        }

        return new ArrayList<>(names);
    }

    public int intoMinutes(String time){
        String[] s = time.split(":");
        int hours = Integer.parseInt(s[0]);
        int minutes = Integer.parseInt(s[1]);

        return hours * 60 + minutes;
    }
}