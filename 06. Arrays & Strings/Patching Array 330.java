

//    https://leetcode.com/problems/patching-array/


class Solution {
    public int minPatches(int[] nums, int n) {
        
        int cnt = 0;
        int i = 0;
        long reach = 0;

        while (reach < n) {
            if(i >= nums.length){
                reach += reach + 1;
                cnt++;
            }else if(i < nums.length && nums[i] <= (reach + 1)){
                reach += nums[i];
                i++;
            }else{
                reach += reach + 1;
                cnt++;
            }
        }

        return cnt;
    }
}