

//  https://leetcode.com/problems/partition-array-according-to-given-pivot/


class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] sml = new int[n];
        int[] grt = new int[n];
        int cnt = 0, j = 0, k = 0;

        for(int val : nums){
            if(val < pivot){
                sml[j++] = val;
            }else if(val == pivot){
                cnt++;
            }else{
                grt[k++] = val;
            }
        }

        int idx = 0;
        for(int i = 0; i < j; i++){
            ans[idx++] = sml[i];
        }

        for(int i = 0; i < cnt; i++){
            ans[idx++] = pivot;
        }

        for(int i = 0; i < k; i++){
            ans[idx++] = grt[i];
        }

        return ans;
    }
}