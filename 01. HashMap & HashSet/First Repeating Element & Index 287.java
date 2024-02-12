

//    https://practice.geeksforgeeks.org/problems/first-repeating-element4018/1

//    https://leetcode.com/problems/find-the-duplicate-number/description/

//    https://www.interviewbit.com/problems/first-repeating-element/



import java.util.*;
class Solution {
    
    public static int firstRepeated(int[] arr, int n) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        for(int i = 0; i < n; i++){
            if(map.get(arr[i]) > 1){
                return i + 1;       //  for index
                // return arr[i];   //  for element
            }
        }
        
        return -1;
    }
}