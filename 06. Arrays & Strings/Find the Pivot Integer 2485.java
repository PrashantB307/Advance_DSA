

//   https://leetcode.com/problems/find-the-pivot-integer/


class Solution {
    public int pivotInteger(int n) {
        
        int left = 1;
        int right = n;
        int fullSum = (n * (n + 1)) / 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int leftSum = (mid * (mid + 1)) / 2;
            int rightSum = fullSum - leftSum + mid;

            if (leftSum == rightSum)
                return mid;
            else if (leftSum < rightSum)
                left = mid + 1;
            else
                right = mid - 1;
        }
        
        return -1;
    }
}