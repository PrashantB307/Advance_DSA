

//   https://leetcode.com/problems/the-number-of-beautiful-subsets/


import java.util.*;
class Solution {
    public int beautifulSubsets(int[] nums, int k) {

        Arrays.sort(nums);

        int ans = helper(nums, k, 0);

        return ans;
    }

    HashSet<Integer> set = new HashSet<>();

    public int helper(int[] arr, int k, int idx) {

        if (idx == arr.length) {
            return set.size() == 0 ? 0 : 1;
        }

        int cnt = helper(arr, k, idx + 1);

        if (set.contains(arr[idx] - k)) {
            return cnt;
        }

        set.add(arr[idx]);
        cnt += helper(arr, k, idx + 1);
        set.remove(arr[idx]);

        return cnt;
    }
}