

//    https://leetcode.com/problems/maximum-average-subarray-i/

//    https://practice.geeksforgeeks.org/problems/maximum-average-subarray5859/1


class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = 0;
        double sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        ans = sum / k;

        while(k < nums.length){
            sum -= nums[k];
            sum += nums[k + 1];

            double avg = sum / k;

            ans = Math.max(ans, avg);
        }

        return ans;
        
    }
}


//XXXXXXXXXXXXXXXXXXXXXXXXXXXX=======>    GFG    <=======XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2 {
    int findMaxAverage(int[] nums, int n, int k) {
        double sum = 0;
        
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        int idx = 0;

        double ans = sum;
        for(int i = 1; i <= n - k; i++){
            sum += nums[i + k - 1] - nums[i - 1];
            if(sum > ans){
                ans = sum;
                idx = i;
            }
        }
    
        return idx;
    }
}
