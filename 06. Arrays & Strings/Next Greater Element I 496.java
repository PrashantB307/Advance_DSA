

//    https://leetcode.com/problems/next-greater-element-i/description/


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++){
            ans[i] = nextGreater(nums1[i], nums2);
        }

        return ans;
    }

    public int nextGreater(int num, int[] nums2){
        int ans = -1;
        for(int i = 0; i < nums2.length; i++){
            if(nums2[i] == num){
                for(int j = i + 1; j < nums2.length; j++){
                    if(nums2[j] > num){
                        ans = nums2[j];
                        return ans;
                    }
                }
            }
        }

        return -1;
    }
}