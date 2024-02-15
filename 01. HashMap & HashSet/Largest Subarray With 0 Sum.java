

//   https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1

//   https://www.codingninjas.com/studio/problems/longest-subset-zero-sum_920321?leftPanelTab=1


import java.util.*;
class GfG
{
    int maxLen(int arr[], int n)
    {
       HashMap<Integer, Integer> map = new HashMap<>();
       int maxLen = 0;
       int sum = 0;
       
       for(int i = 0; i < n; i++){
           sum += arr[i];
           
           if(sum == 0){
               maxLen = i + 1;
           }else if(map.containsKey(sum)){
               maxLen = Math.max(maxLen, i - map.get(sum));
           }else{
               map.put(sum, i);
           }
       }
       
       return maxLen;
    }
}