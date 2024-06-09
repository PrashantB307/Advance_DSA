

//    https://www.geeksforgeeks.org/problems/coins-of-geekland--141631/1


class Solution
{
    public int Maximum_Sum(int mat[][],int n,int k){
        
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < n - k + 1; i++){
            int sum = 0;
            for(int j = 0; j < n - k + 1; j++){
                sum = findSum(mat, i, j, k);
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    int findSum(int mat[][], int a, int b, int k){
        int sum = 0;
        for(int i = a; i < a + k; i++){
            for(int j = b; j < b + k; j++){
                sum += mat[i][j];
            }
        }

        return sum;
    }
}
