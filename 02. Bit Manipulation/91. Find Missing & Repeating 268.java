


//    https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1

//    https://leetcode.com/problems/missing-number/


import java.util.*;
class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] ans = new int[2];
        Arrays.sort(arr);
        
        for(int i = 0; i < n - 1; i++){
            if(arr[i] == arr[i + 1]){
                ans[0] = arr[i];
                break;
            }
        }
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < n; i++){
            sum1 += arr[i];
        }
        sum1 = sum1 - ans[0];
        
        for(int i = 1; i <= n; i++){
            sum2 += i;
        }
        
        ans[1] = sum2 - sum1;
        
        return ans;
        
    }
}



// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i :  nums){
            map.put(i, true);
        }
        int ans = 0;
        for(int i = 0; i <= nums.length; i++){
            if(map.get(i) == null){
                ans = i;
                break;
            }
        }

        return ans;
    }
}