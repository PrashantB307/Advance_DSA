

//   https://leetcode.com/problems/kth-missing-positive-number/description/

//   https://www.geeksforgeeks.org/problems/k-th-missing-element3635/1

//   https://www.codingninjas.com/studio/problems/kth-missing-element_893215


import java.util.*;
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length + k;
        Set<Integer> set = new HashSet<>();

        
        for(int val : arr){
            set.add(val);    
        }

        int cnt = 0;
        for(int i = 1; i <= n; i++){
            if(!set.contains(i)){
                cnt++;
            }

            if(cnt == k){
                return i;
            }
        }

        return -1;
    }
}


//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX=====>   GFG    <=====XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

class Complete{
    int KthMissingElement(int arr[], int N, int k)
    {
         Set<Integer> set = new HashSet<>();
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int val : arr){
            if(val < min){
                min = val;
            }    
            
            if(val > max){
                max = val;
            }
        }
        
        for(int val : arr){
             set.add(val);   
        }
        
        int cnt = 0;
        for(int i = min; i <= max; i++){
            if(!set.contains(i)){
                cnt++;
            }

            if(cnt == k){
                return i;
            }
        }

        return -1;
    }
}
