

//   https://www.geeksforgeeks.org/problems/split-an-array-into-two-equal-sum-subarrays/1


class Solution {
    public boolean canSplit(int arr[]) {
        int totSum = 0;

        for(int val : arr){
            totSum += val;
        }

        int currSum = 0;
        for(int val : arr){
            currSum += val;
            int rem = totSum - currSum;
            if(currSum == rem){
                return true;
            }
        }

        return false;
    }
}