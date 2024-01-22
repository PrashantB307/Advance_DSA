

//   https://leetcode.com/problems/steps-to-make-array-non-decreasing/


import java.util.*;
class Solution {
    public int totalSteps(int[] nums) {

        int n = nums.length;
        int ans = 0;
        
        Stack<int[]> st = new Stack<>();
        st.push(new int[]{nums[n - 1], 0});

        for(int i = n - 2; i >= 0; i--){
            int cnt = 0;

            while (!st.isEmpty() && nums[i] > st.peek()[0]) {
                cnt = Math.max(cnt + 1, st.peek()[1]);
                st.pop();
            }

            ans = Math.max(ans, cnt);
            st.push(new int[] {nums[i], cnt});
        }

        return ans;
    }
}