

//   https://practice.geeksforgeeks.org/problems/unique-frequencies-of-not/1

//   https://leetcode.com/problems/unique-number-of-occurrences/


import java.util.*;
class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            int freq = m.getValue();
            if(set.contains(freq) == false){
                set.add(freq);
            }else{
                return false;
            }
        }

        return true;
    }
}
   