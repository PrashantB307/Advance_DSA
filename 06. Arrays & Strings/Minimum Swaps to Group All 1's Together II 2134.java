

//   https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together-ii/


class Solution {
    public int minSwaps(int[] nums) {
        
        int n = nums.length;
        int onces  = 0;
        
        for(int val : nums){
            if(val == 1){
                onces++;
            }
        }

        int i = 0;
        int j = 0;

        int currOnce = 0;
        int maxCnt = 0; 

        while (j < 2 * n) {
            if(nums[j % n] == 1){
                currOnce++;
            }

            if(j - i + 1 > onces){
                currOnce -= nums[i % n];
                i++; 
            }

            maxCnt = Math.max(maxCnt, currOnce);
            j++;
        }

        return onces - maxCnt;
    }
}