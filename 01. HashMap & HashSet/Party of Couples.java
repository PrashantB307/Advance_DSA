

//   https://www.geeksforgeeks.org/problems/alone-in-couple5507/1


import java.util.*;
class Solution{
    static int findSingle(int n, int arr[]){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int val : arr){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        for(int val : arr){
            if(map.get(val) % 2 != 0){
                return val;
            }
        }

        return -1;
    }
}