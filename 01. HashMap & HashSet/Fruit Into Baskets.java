

//   https://www.geeksforgeeks.org/problems/fruit-into-baskets-1663137462/1

import java.util.*;
class Solution {
    public static int totalFruits(Integer[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int l = 0;

        for(int r = 0; r < arr.length; r++){
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);

            if(map.size() > 2){
                if(map.get(arr[l]) - 1 == 0){
                    map.remove(arr[l]);
                }else{
                    map.put(arr[l], map.get(arr[l]) - 1);
                }

                l++;
            }

            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}