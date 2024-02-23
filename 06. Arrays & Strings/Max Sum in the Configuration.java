

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
