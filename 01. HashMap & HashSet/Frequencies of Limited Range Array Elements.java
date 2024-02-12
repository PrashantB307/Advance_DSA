

//   https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1

//   https://www.codingninjas.com/studio/problems/count-frequency-in-a-range_8365446



import java.util.*;
class Solution {
    public static int[] countFrequency(int n, int x, int []nums){
       HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int val : nums){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        
        int[] arr = new int[n];
        Arrays.fill(arr, 0);
        
        for(int i = 1; i <= n; i++){
            if(map.containsKey(i)){
                arr[i - 1] = map.get(i);
            }
        }
        
        return arr;
    }
}