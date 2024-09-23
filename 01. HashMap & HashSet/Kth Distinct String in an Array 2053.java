

//   https://leetcode.com/problems/kth-distinct-string-in-an-array/


import java.util.*;
class Solution {
    public String kthDistinct(String[] arr, int k) {
        
        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for(String str : arr){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for(String str : arr){
            if(map.get(str) == 1){
                list.add(str);
            }
        }

        if(list.size() >= k){
            return list.get(k - 1);
        }else{
            return "";
        }
    }
}