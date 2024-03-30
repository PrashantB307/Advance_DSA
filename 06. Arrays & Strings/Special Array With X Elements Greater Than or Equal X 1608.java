

//   https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/


class Solution {
    public int specialArray(int[] nums) {

        int n = nums.length;
        for(int i = 0; i <= n; i++){
            int c = 0;

            for(int val : nums){
                if(val >= i){
                    c++;
                }
            }

            if(i == c){
                return i;
            }
        }

        return -1;
    }
}