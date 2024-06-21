

//    https://leetcode.com/problems/delete-and-earn/

//    https://www.naukri.com/code360/problems/delete-and-score_2436719


class Solution {
    public int deleteAndEarn(int[] nums) {
        
        int[] cnt = new int[10001];

        for(int val : nums){
            cnt[val]++;
        }

        int inc = 0;
        int exc = 0;

        for(int i = 0; i < 10001; i++){
            int ni = exc + cnt[i] * i;
            int ne = Math.max(exc, inc);

            exc = ne;
            inc = ni;
        }

        return Math.max(inc, exc);
    }
}