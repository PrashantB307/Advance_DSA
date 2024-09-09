

//   https://leetcode.com/problems/find-missing-observations/


class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length; 
        int l = m + n; 
        int sum = 0; 

        for (int val : rolls) {
            sum += val;
        }

        int total = l * mean; 
        int left = total - sum; 

        if (left >= n && left <= 6 * n) {
            int[] ans = new int[n];
            int each = left / n, rem = left % n;
            
            for (int i = 0; i < n; i++) {
                int extra = 0;
                if (rem > 0) {
                    rem--;
                    extra = 1;
                }

                ans[i] = each + extra;
            }

            return ans;
        }

        return new int[0]; 
    }
}