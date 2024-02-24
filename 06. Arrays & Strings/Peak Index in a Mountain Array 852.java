

//    https://leetcode.com/problems/peak-index-in-a-mountain-array/description/


class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int l = 0;
        int r = arr.length - 1;
        int mid = (l + r) / 2;

        while(l <= r){
             mid = (l + r) / 2;

            if(arr[mid] < arr[mid + 1]){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }

        return l;
    }
}