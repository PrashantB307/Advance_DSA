

//    https://leetcode.com/problems/continuous-subarray-sum/


import java.util.*;
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        if(nums.length < 2){
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);

        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            int rem = sum % k;
            if(map.containsKey(rem)){
                if(map.get(rem) < i){
                    return true;
                }
            }else{
                map.put(rem, i + 1);
            }
        }

        return false;
    }
}


//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX=====>   NEW    <=====XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

class Solution2 {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum += nums[i];

            if(nums[i - 1] == 0 && nums[i] == 0){
                return true;
            }

            if(sum % k == 0){
                return true;
            }

            int j = 0;
            int temp = sum;

            while ((i - j) > 1 && temp >= k) {
                temp -= nums[j];
                j++;

                if(temp % k == 0){
                    return true;
                }
            }
        }

        return false;
    }
}