

//   https://leetcode.com/problems/minimum-number-of-operations-to-make-all-array-elements-equal-to-1/


class Solution {
    public int minOperations(int[] nums) {
        
        int n = nums.length;
        int cnt1 = 0;
        
        for(int val : nums){
            if(val == 1){
                cnt1++;
            }
        }

        if(cnt1 > 0){
            return n - cnt1;
        }

        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            int g = nums[i];
            for(int j = i + 1; j < n; j++){
                g = getGCD(g, nums[j]);

                if(g == 1){
                    ans = Math.min(ans, j - i);
                }
            }
        }

        if(ans == Integer.MAX_VALUE){
            return -1;
        }

        return ans + n - 1;

    }

    int getGCD(int a, int b){
        if(b == 0){
            return a;
        }

        return getGCD(b, a % b);
    }
}