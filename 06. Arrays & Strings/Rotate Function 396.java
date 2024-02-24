

//   https://leetcode.com/problems/rotate-function/

//   https://www.codingninjas.com/studio/problems/rotate-function_1264290


class Solution {
    public int maxRotateFunction(int[] nums){
        int n = nums.length;
        int f0 = 0;
        int totalSum = 0;

        for(int i = 0; i < n; i++){
            totalSum += nums[i];
            f0 += i * nums[i];
        }

        int maxFn = f0;
        int preFn = f0;

        for(int i = n - 1; i > 0; i--){
            int num = nums[i];
            int nextfn = preFn + totalSum - n * num;
            maxFn = Math.max(maxFn, nextfn);
            preFn = nextfn;
        }

        return maxFn;
    }
}
