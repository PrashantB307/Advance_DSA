

//   https://leetcode.com/problems/search-insert-position/description/

//   https://practice.geeksforgeeks.org/problems/search-insert-position-of-k-in-a-sorted-array/1


class Solution {
    public int searchInsert(int[] nums, int tar) {
        
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        if(tar > nums[r]){
            return n;
        }

        while (l <= r) {
            int mid = (l + r) / 2;
            if(nums[mid] == tar){
                return mid;
            }

            if(tar < nums[mid]){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }

        return l;
    }
}


// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2 {
    public int searchInsert(int[] nums, int tar) {
        int n = nums.length;
        if(tar < nums[0]){
            return 0;
        }

        if(tar > nums[n - 1]){
            return n;
        }

        for(int i = 0; i < n; i++){
            if(nums[i] == tar){
                return i;
            }else if(nums[i] > tar){
                return i;
            }
        }

        return -1;
    }
}