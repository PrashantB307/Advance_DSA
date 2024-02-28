

//    https://leetcode.com/problems/number-of-subarrays-with-lcm-equal-to-k/description/


class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int cnt = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int currLCM = nums[i];

            if(currLCM == k){
                cnt++;
            }

            for(int j = i + 1; j < n; j++){
                if(nums[j] > k){
                    break;
                }

                int gcd = getgcd(currLCM, nums[j]);
                currLCM = getlcm(currLCM, nums[j], gcd);

                if(currLCM == k){
                    cnt++;
                }
            }
        }

        return cnt;
    }

    int getgcd(int a, int b) {
        if (b == 0){
            return a;
        }
        
        return getgcd(b, a % b);
    }

    int getlcm(int a, int b, int gcd){
        return ( (a * b ) / gcd);
    }
}