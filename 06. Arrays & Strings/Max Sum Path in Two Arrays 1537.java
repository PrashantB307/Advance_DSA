

//    https://practice.geeksforgeeks.org/problems/max-sum-path-in-two-arrays/1

//    https://leetcode.com/problems/get-the-maximum-score/submissions/1108862320/


class Solution
{
    int maxPathSum(int arr1[], int arr2[])
    {
        int totalSum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0;

        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                sum1 += arr1[i];
                i++;
            }else if(arr2[j] < arr1[i]){
                sum2 += arr2[j];
                j++;
            }else{
                totalSum += Math.max(sum1, sum2);
                totalSum += arr1[i];
                i++; j++;
                sum1 = 0; sum2 = 0; 
            }
        }

        while (i < n) {
            sum1 += arr1[i];
            i++;        
        }

        while (j < m) {
            sum2 += arr2[j];
            j++;        
        }

        totalSum += Math.max(sum1, sum2);
        return totalSum;
    }
}