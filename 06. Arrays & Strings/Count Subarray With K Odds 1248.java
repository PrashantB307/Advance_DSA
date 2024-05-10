

//   https://leetcode.com/problems/count-number-of-nice-subarrays/description/

//   https://www.geeksforgeeks.org/problems/count-subarray-with-k-odds/1


class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        int cnt = 0;
        int Ofreq = 0;
        int n = nums.length;
        int total = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if(nums[i] % 2 == 1){
                Ofreq++;
                cnt = 0;
            }

            while (Ofreq == k) {
                if(nums[j] % 2 == 1){
                    Ofreq--;
                }

                j++;
                cnt++;
            }

            total += cnt;
        }

        return total;
    }
}