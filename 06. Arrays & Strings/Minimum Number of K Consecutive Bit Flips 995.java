

//   https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips


class Solution {
    public int minKBitFlips(int[] nums, int k) {
        
        int cnt = 0, out = 0;
        boolean[] chekFlip = new boolean[nums.length];

        for(int i = 0; i < nums.length; i++){
            if((nums[i] == 0 && cnt % 2 == 0) || (nums[i] == 1 && cnt % 2 != 0)){
                cnt++;
                out++;

                if(i + k - 1 >= nums.length){
                    return -1;
                }else{
                    chekFlip[i + k - 1] = true;
                }
            }

            if(chekFlip[i]){
                cnt--;
            }
        }

        return out;
    }
}