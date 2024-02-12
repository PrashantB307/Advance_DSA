
 
//    https://practice.geeksforgeeks.org/problems/frequency-game/1


import java.util.*;
class Solution {
   
    public static int LargButMinFreq(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int freq = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if((m.getValue() <= freq) && m.getKey() > max){
                freq = m.getValue();
                max = m.getKey();
            }
        }

        return max;
    }
}