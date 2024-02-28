

//    https://leetcode.com/problems/number-of-subarrays-with-gcd-equal-to-k/


class Solution {
    public int subarrayGCD(int[] nums, int k) {
        
        int cnt = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int currGCD = nums[i];

            if(currGCD == k){
                cnt++;
            }

            for(int j = i + 1; j < n; j++){
                if(nums[j] < k){
                    break;
                }

                currGCD = gcd(currGCD, nums[j]);
                if(currGCD == k){
                    cnt++;
                }
            }
        }

        return cnt;
    }

    int gcd(int a, int b) {
        if (b == 0){
            return a;
        }
        
        return gcd(b, a % b);
    }
}