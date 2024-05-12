

//   https://www.geeksforgeeks.org/problems/maximum-sum-of-subarray-less-than-or-equal-to-x4033/1


class Solution
{
    long findMaxSubarraySum(long arr[], int n,int X)
    {
        long sum = 0;
        long max = 0;

        int i = 0, j = 0;
        for(i = 0; i < n; i++){
            sum += arr[i];
            if(sum <= X){
                 max = Math.max(max, sum);
            }

            while (sum > X) {
                sum -= arr[j];
                j++;
            }

            max = Math.max(max, sum);
        }

        return max;
    }
}