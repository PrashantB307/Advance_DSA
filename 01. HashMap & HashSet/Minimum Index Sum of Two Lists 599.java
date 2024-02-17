

//    https://leetcode.com/problems/minimum-index-sum-of-two-lists/description/


import java.util.*;
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        int min = Integer.MAX_VALUE;
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < list1.length; i++){
            map.put(list1[i], map.getOrDefault(list1[i], 0) + 1);
        }

        int sum = 0;
        ArrayList<String> list = new ArrayList<>();
        

        for(int i = 0; i < list2.length; i++){
            if(map.containsKey(list2[i])){
                sum = i + map.get(list2[i]);
                if(sum <= min){
                    min = sum;
                    list.add(list2[i]);
                }

            }
        }

        return list.toArray(new String[0]);
    }
}