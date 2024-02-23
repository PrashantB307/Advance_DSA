

//   https://www.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1


import java.util.*;
class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        List<Integer> list = new ArrayList<>();
        for(int val : arr){
            if(val >= 0){
                list.add(val);
            }
        }
        for(int val : arr){
            if(val < 0){
                list.add(val);
            }
        }

        int i = 0;
        for(int val : list){
            arr[i++] = val;
        }
    }
}