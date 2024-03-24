

//    https://leetcode.com/problems/beautiful-arrangement-ii/description/


class Solution {
    public int[] constructArray(int n, int k) {
        
        int[] ans = new int[n];

        int h = n;
        int l = 1;
        int idx = 0;
        ans[idx++] = l++;
        boolean flag = false;

        while (k > 1) {
            ans[idx++] = h--;
            k--;
            flag = true;

            if(k > 1){
                ans[idx++] = l++;
                k--;
                flag = false;
            }
        }

        while (idx < n) {
            if (flag) {
                ans[idx++] = h--;
            }else{
                ans[idx++] = l++;
            }
        }

        return ans;
    }
}