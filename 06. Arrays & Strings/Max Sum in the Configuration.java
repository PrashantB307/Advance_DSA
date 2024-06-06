

//   https://www.geeksforgeeks.org/problems/max-sum-in-the-configuration/1

//   https://www.codingninjas.com/studio/problems/maximum-sum_2180775


class GfG
{
    int max_sum(int arr[], int n)
    {
        int sum = 0;
        int sumElem = 0;

        for(int i = 0; i < n ; i++){
            sum += arr[i] * i;
            sumElem += arr[i];
        }

        int max = sum;

        for(int i = 0; i < n ;i++){
            sum = sum - sumElem + arr[i] * n;
            max = Math.max(max, sum);
        }

        return max;
    }	
}


//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX=====>   NEW    <=====XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution {
    long max_sum(int arr[], int n) {
        long sum = 0;
        long preSum = 0;

        for(int i = 0; i < n ; i++){
            preSum += arr[i] * (long)i;
            sum += arr[i];
        }

        long max = preSum;

        for(int i = 1; i < n ;i++){
            long currSum = preSum - (sum - arr[i - 1]) + (long)arr[i - 1] * (n - 1);
            preSum = currSum;

            max = Math.max(max, currSum);
        }

        return max;
    }	
}