

//   https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/


class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0;
        int j = -1;
        int cz = 0;
        int res = 0;

        while(i < nums.length){
            if(nums[i] == 1){
                i++;
            }else{
                i++;
                cz++;
            }

            while(cz > 1 && j < i){
                j++;

                if(nums[j] == 0){
                    cz--;
                }
                
            }

            int len = i - j - 1;
            res = Math.max(res, len);
        }

        return res - 1;
    }
}