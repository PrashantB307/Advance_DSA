

//     https://practice.geeksforgeeks.org/problems/first-element-to-occur-k-times5150/1


import java.util.*;
class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            if(map.containsKey(a[i]) == false){
                map.put(a[i], 1);
            }else{
                map.put(a[i] , map.get(a[i]) + 1);
            }
            if(map.get(a[i]) >= k){
                return a[i];
            }
        }
        return -1;
    } 
}

