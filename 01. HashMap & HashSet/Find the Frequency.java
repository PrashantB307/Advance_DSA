

//    https://www.geeksforgeeks.org/problems/find-the-frequency/1


import java.util.*;
class Solution{
    int findFrequency(int A[], int x){
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int val : A){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        for(int val : map.keySet()){
            if(val == x){
                return map.get(val);
            }
        }

        return -1;
    }
}